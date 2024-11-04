package com.example.products_management.service_Implementation;

import com.example.products_management.entity.Order;
import com.example.products_management.entity.OrderItem;
import com.example.products_management.entity.Product;
import com.example.products_management.entity.User;
import com.example.products_management.repository.OrderItemRepository;
import com.example.products_management.repository.OrderRepository;
import com.example.products_management.repository.ProductRepository;
import com.example.products_management.service.OrderService;
import com.example.products_management.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl extends Order implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    @Transactional
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(int orderId) {
        return null;
    }

    @Override
    public List<Order> getOrdersForUser(int userId) {
        return orderRepository.findByUserId(userId);
    }


    @Override
    public List<OrderItem> getCartItems(User currentUser) {
        return orderItemRepository.findByUserAndOrderIsNull(currentUser);
    }

    @Override
    public void addProductToCart(User user, Product product, int quantity) {
        if(user==null){
            throw new IllegalArgumentException("User cannot be null");
        }

        List<OrderItem> existingItems = orderItemRepository.findByUserAndProduct(user, product);

        if (!existingItems.isEmpty()) {
            // Update quantity if the item already exists in the cart
            OrderItem existingItem = existingItems.get(0); // Assuming there's only one order item per product in the cart
            existingItem.setOrderQuantity(existingItem.getOrderQuantity() + quantity);
            existingItem.setOrderPrice(product.getProdPrice()); // Update price if necessary
            orderItemRepository.save(existingItem);
        } else {
            // Create a new order item since it doesn't exist in the cart
            OrderItem orderItem = new OrderItem();
            orderItem.setProduct(product);
            orderItem.setUser(user);
            orderItem.setOrderPrice(product.getProdPrice());
            orderItem.setOrderQuantity(quantity); // Set the chosen quantity
            orderItemRepository.save(orderItem);
        }
    }

    @Override
    public void submitOrder(User user, int productId, int quantity) {
        Order order = new Order();
        order.setUser(user);
        order.setOrderStatus("Pending");

        Product product = productService.findById(productId);

        OrderItem orderItem = order.addOrderItem(product, quantity, user);

        order.setOrderTotalAmount(orderItem.getOrderPrice().multiply(BigDecimal.valueOf(quantity)));

        orderRepository.save(order);
    }

    @Override
    public void changeOrderStatus(int orderId, String status) {
        Order order = orderRepository.findById(orderId).orElseThrow(() -> new RuntimeException("Order not found"));
        order.setOrderStatus(status);
        orderRepository.save(order);
    }
}