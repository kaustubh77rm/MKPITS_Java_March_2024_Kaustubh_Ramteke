package com.example.products_management.entity;
import lombok.*;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @Column(name = "order_total_amount", precision = 10, scale = 2, nullable = false)
    private BigDecimal orderTotalAmount = BigDecimal.ZERO;

    @Column(name = "order_status",nullable = false)
    private String orderStatus;

    @ManyToOne
    @JoinColumn(name = "order_user_id")
    private User user;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<OrderItem> orderItems = new ArrayList<>();

    public OrderItem addOrderItem(Product product, int quantity, User user) {
        OrderItem orderItem = new OrderItem();
        orderItem.setUser(user);
        orderItem.setProduct(product);
        orderItem.setOrderQuantity(quantity);
        orderItem.setOrderPrice(product.getProdPrice().multiply(BigDecimal.valueOf(quantity)));

        orderItem.setOrder(this);
        this.orderItems.add(orderItem);
        return orderItem;
    }

    public void calculateTotal(List<CartItem> cartItems) {
        for (CartItem item : cartItems) {
            BigDecimal productPrice = item.getProduct().getProdPrice();
            BigDecimal quantity = BigDecimal.valueOf(item.getQuantity());
            BigDecimal amount = productPrice.multiply(quantity);
            orderTotalAmount = orderTotalAmount.add(amount);
        }
    }

    @PrePersist
    protected void onCreate() {
        orderDate = LocalDateTime.now();
    }
}