package com.example.products_management.repository;

import com.example.products_management.entity.Cart;
import com.example.products_management.entity.CartItem;
import com.example.products_management.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
    List<CartItem> findByCart(Cart cart);

    @Modifying
    @Transactional
    @Query("delete from CartItem c where c.cart = :cart")
    void deleteAllByCart(Cart cart);
}