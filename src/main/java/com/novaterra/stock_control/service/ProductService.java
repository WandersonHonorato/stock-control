package com.novaterra.stock_control.service;

import com.novaterra.stock_control.model.Product;
import com.novaterra.stock_control.repository.ProductRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Getter
@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;


    public List<Product> listProduct() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductId(Long id) {
        return productRepository.findById(id);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);

    }
}
