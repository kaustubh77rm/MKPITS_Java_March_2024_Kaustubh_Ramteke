package com.example.products_management.repository;
import com.example.products_management.entity.OrderItem;
import com.example.products_management.entity.Product;
import com.example.products_management.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
    List<OrderItem> findByUserAndOrderIsNull(User user);
    List<OrderItem> findByUserAndProduct(User currentUser, Product product);
}