package com.yasha.store.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yasha.store.exceptions.NotFoundResourceException;
import com.yasha.store.model.Product;
import com.yasha.store.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
        //         orElseThrow(() -> new EmptyDatabaseException("Do not exist any product."));
    }

    public Product findById(long id) {
        return productRepository.findById(id).
               orElseThrow(() ->
                new NotFoundResourceException("Product with ID " + id + " not found."));
                
    }
            
    // public Optional<Product> findProductByName(String name) {
        //     return productRepository.findByName(name).orElseThrow(
            //         () ->
            //             new NotFoundResourceException("Product with " + name + " name not found."));
            // }
                    
    public Product save(Product productToSave) {
        return productRepository.save(productToSave);
    }
    
    public void delete(long id) {
        if (!productRepository.existsById(id)) {
            throw new NotFoundResourceException("Product with ID " + id + " not found.");
        }
        productRepository.deleteById(id);
    }
}
                