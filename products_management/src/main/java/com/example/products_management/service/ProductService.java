package com.example.products_management.service;

import com.example.products_management.entity.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product saveProduct(Product product);
    void deleteProduct(int id);
    Product getProductById(int productId);
    Product update(int productId, Product updatedProduct);
    Product findById(int productId);
}