package com.example.products_management.entity;

import lombok.*;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "prod_name", nullable = false)
    private String prodName;

    @Column(name = "prod_description", columnDefinition = "TEXT")
    private String prodDescription;

    @Column(name = "prod_price", nullable = false)
    private BigDecimal prodPrice;

    @Column(name = "prod_stock_quantity", nullable = false)
    private int prodStockQuantity;

    @Column(name = "prod_created_date", nullable = false, updatable = false)
    private LocalDateTime prodCreatedDate;

    @Column(name = "prod_last_modified_date")
    private LocalDateTime prodModifiedDate;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<OrderItem> orderItems = new ArrayList<>();

    public void addOrderItem(OrderItem orderItem) {
        if (orderItem.getProduct() != null) {
            orderItem.getProduct().removeOrderItem(orderItem);
        }
        orderItems.add(orderItem);
        orderItem.setProduct(this);
    }


    public void removeOrderItem(OrderItem orderItem) {
        orderItems.remove(orderItem);
        orderItem.setProduct(null);
    }

    @PrePersist
    protected void onCreate() {
        prodCreatedDate = LocalDateTime.now();
        prodModifiedDate = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        prodModifiedDate = LocalDateTime.now();
    }
}