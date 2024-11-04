package com.example.products_management.service;

import com.example.products_management.entity.Cart;
import com.example.products_management.entity.CartItem;
import com.example.products_management.entity.User;

import java.util.List;
import java.util.Optional;

public interface CartItemService {
    CartItem createCartItem(CartItem cartItem);
    List<CartItem> getAllCartItems();
    Optional<CartItem> getCartItemById(int id);
    void deleteCartItem(int id);
    List<CartItem> getCartItemsByCart(Cart cart);
    List<CartItem> getCartItemsForCart(Cart cart);
    void removeCartItem(Cart cart, int productId);
    Cart getCartByUser(User user);
}