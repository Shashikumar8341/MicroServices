package com.ciq.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciq.entity.Product;

public interface ProductReposi extends JpaRepository<Product, Integer>{

}
