package com.max.Spring_Boot.Crud.Services;

import com.max.Spring_Boot.Crud.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
