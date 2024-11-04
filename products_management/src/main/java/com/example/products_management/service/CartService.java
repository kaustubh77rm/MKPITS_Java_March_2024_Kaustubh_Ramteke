package com.example.products_management.service;

import com.example.products_management.entity.Cart;
import com.example.products_management.entity.CartItem;
import com.example.products_management.entity.User;

import java.math.BigDecimal;
import java.util.List;

public interface CartService {
    Cart createCart(Cart cart);
    List<Cart> getAllCarts();
    Cart getCartById(int id);
    void deleteCart(int id);
    Cart getCartByUser(User currentUser);
    List<CartItem> getCartItemsForUser(User currentUser);
    Cart getCartForUser(User currentUser);
    void saveCart(Cart cart);
    void clearCart(String email);
    public BigDecimal calculateTotalAmount(List<CartItem> cartItems);
}