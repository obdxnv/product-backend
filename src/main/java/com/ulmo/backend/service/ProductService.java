package com.ulmo.backend.service;

import com.ulmo.backend.dto.ProductDTO;
import com.ulmo.backend.model.Product;
import com.ulmo.backend.repository.ProductRepository;
import com.ulmo.backend.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product getById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product topilmadi: " + id));
    }

    public Product create(ProductDTO dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setDescription(dto.getDescription());

        return productRepository.save(product);
    }

    public Product update(Long id, ProductDTO dto) {
        Product product = getById(id);

        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setDescription(dto.getDescription());

        return productRepository.save(product);
    }

    public void delete(Long id) {
        Product product = getById(id);
        productRepository.delete(product);
    }
}