package com.example.products_management.service;

import com.example.products_management.entity.Order;
import com.example.products_management.entity.OrderItem;
import com.example.products_management.entity.Product;
import com.example.products_management.entity.User;
import java.util.List;

public interface OrderService {
    public List<Order> getOrdersForUser(int userId);
    public Order saveOrder(Order order);
    public List<Order> getAllOrders();
    public Order getOrderById(int orderId);
    List<OrderItem> getCartItems(User currentUser);
    void addProductToCart(User currentUser, Product product, int quantity);
    void submitOrder(User currentUser, int productId, int quantity);
    void changeOrderStatus(int orderId, String status);
}