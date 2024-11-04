package com.example.products_management.service_Implementation;

import com.example.products_management.entity.Cart;
import com.example.products_management.entity.CartItem;
import com.example.products_management.entity.User;
import com.example.products_management.repository.CartItemRepository;
import com.example.products_management.repository.CartRepository;
import com.example.products_management.service.CartService;
import com.example.products_management.service.UserService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;
    private final CartItemRepository cartItemRepository;
    private final UserService userService;

    @Autowired
    public CartServiceImpl(CartRepository cartRepository, CartItemRepository cartItemRepository, UserService userService) {
        this.cartRepository = cartRepository;
        this.cartItemRepository = cartItemRepository;
        this.userService = userService;
    }

    @Override
    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    @Override
    @Transactional
    public Cart getCartById(int id) {
        Cart cart = cartRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Cart not found"));
        return cart;
    }

    @Override
    public void deleteCart(int id) {
        cartRepository.deleteById(id);
    }

    @Override
    public Cart getCartByUser(User currentUser) {
        return cartRepository.findByUser(currentUser);
    }

    @Override
    public List<CartItem> getCartItemsForUser(User currentUser) {
        Cart cart = getCartForUser(currentUser);
        if (cart != null) {
            return cartItemRepository.findByCart(cart);
        }
        return new ArrayList<>(); // Return an empty list if no cart is found
    }

    @Override
    public Cart getCartForUser(User currentUser) {
        return cartRepository.findByUser(currentUser);
    }

    @Override
    public void saveCart(Cart cart) {
        cartRepository.save(cart);
    }

    public void clearCart(String email) {
        User user = userService.findUserByEmail(email);
        Cart cart = getCartByUser(user);

        if (cart != null && !cart.getCartItems().isEmpty()) {
            cartItemRepository.deleteAllByCart(cart);
            cart.setCartItems(new ArrayList<>());
        }
    }


    @Override
    public BigDecimal calculateTotalAmount(List<CartItem> cartItems) {
        BigDecimal totalAmount = BigDecimal.ZERO;
        for (CartItem item : cartItems) {
            totalAmount = totalAmount.add(item.getPrice().multiply(BigDecimal.valueOf(item.getQuantity())));
        }
        return totalAmount;
    }
}