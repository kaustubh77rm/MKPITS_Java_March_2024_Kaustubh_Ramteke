package com.example.products_management.service_Implementation;

import com.example.products_management.entity.OrderItem;
import com.example.products_management.entity.Product;
import com.example.products_management.repository.ProductRepository;
import com.example.products_management.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        System.out.println("Saving product: " + product);
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
    @Transactional
    @Override
    public Product getProductById(int productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    @Transactional
    @Override
    public Product update(int productId, Product updatedProduct) {
        Product existingProduct = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        // Update product fields
        existingProduct.setProdName(updatedProduct.getProdName());
        existingProduct.setProdDescription(updatedProduct.getProdDescription());
        existingProduct.setProdPrice(updatedProduct.getProdPrice());
        existingProduct.setProdStockQuantity(updatedProduct.getProdStockQuantity());

        for (OrderItem updatedOrderItem : updatedProduct.getOrderItems()) {
            if (!existingProduct.getOrderItems().contains(updatedOrderItem)) {
                existingProduct.addOrderItem(updatedOrderItem);
            }
        }

        existingProduct.getOrderItems().removeIf(orderItem -> !updatedProduct.getOrderItems().contains(orderItem));

        return productRepository.save(existingProduct);
    }

    @Override
    public Product findById(int productId) {
        return productRepository.findById(productId).orElse(null);
    }
}