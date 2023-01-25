package com.algo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algo.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{

}
