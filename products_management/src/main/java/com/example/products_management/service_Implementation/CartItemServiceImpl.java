package com.example.products_management.service_Implementation;

import com.example.products_management.entity.Cart;
import com.example.products_management.entity.CartItem;
import com.example.products_management.entity.User;
import com.example.products_management.repository.CartItemRepository;
import com.example.products_management.repository.CartRepository;
import com.example.products_management.service.CartItemService;
import com.example.products_management.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartItemServiceImpl implements CartItemService {
    @Autowired
    private CartService cartService;
    private final CartItemRepository cartItemRepository;
    private final CartRepository cartRepository;

    @Autowired
    public CartItemServiceImpl(CartItemRepository cartItemRepository, CartRepository cartRepository) {
        this.cartItemRepository = cartItemRepository;
        this.cartRepository = cartRepository;
    }

    @Override
    public CartItem createCartItem(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    @Override
    public List<CartItem> getAllCartItems() {
        return cartItemRepository.findAll();
    }

    @Override
    public Optional<CartItem> getCartItemById(int id) {
        return cartItemRepository.findById(id);
    }

    @Override
    public void deleteCartItem(int id) {
        cartItemRepository.deleteById(id);
    }

    @Override
    public List<CartItem> getCartItemsByCart(Cart cart) {
        return cartItemRepository.findByCart(cart);
    }

    @Override
    public List<CartItem> getCartItemsForCart(Cart cart) {
        return cartItemRepository.findByCart(cart);
    }

    @Override
    public void removeCartItem(Cart cart, int productId) {
        CartItem itemToRemove = cart.getCartItems().stream()
                .filter(item -> item.getProduct().getId() == productId)
                .findFirst()
                .orElse(null);

        if (itemToRemove != null) {
            cart.getCartItems().remove(itemToRemove);
            cartItemRepository.delete(itemToRemove);
            cartService.saveCart(cart);
        }
    }

    @Override
    public Cart getCartByUser(User user) {
        return cartRepository.findCartWithItemsByUser(user);
    }
}