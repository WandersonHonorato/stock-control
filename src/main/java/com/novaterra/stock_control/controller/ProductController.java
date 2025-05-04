package com.novaterra.stock_control.controller;

import com.novaterra.stock_control.model.Product;
import com.novaterra.stock_control.service.ProductService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Getter
@RequiredArgsConstructor
@RequestMapping("api/products")
@RestController
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product productRequest = productService.saveProduct(product);
        return ResponseEntity.status(201).body(productRequest);

    }
}
