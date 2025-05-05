package com.novaterra.stock_control.repository;

import com.novaterra.stock_control.model.Product;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Id> {

    Optional<Product> findById(Long id);
}

