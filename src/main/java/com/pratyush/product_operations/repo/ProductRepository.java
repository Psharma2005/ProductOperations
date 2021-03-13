package com.pratyush.product_operations.repo;

import com.pratyush.product_operations.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Integer>  {
}
