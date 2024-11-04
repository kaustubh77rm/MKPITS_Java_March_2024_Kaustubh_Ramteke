package com.example.products_management.repository;

import com.example.products_management.entity.Cart;
import com.example.products_management.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
    Cart findByUser(User currentUser);
    @Query("select c from Cart c join fetch c.cartItems where c.user = :user")
    Cart findCartWithItemsByUser(@Param("user") User user);

}