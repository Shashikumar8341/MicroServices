package com.ciq.service;

import java.util.List;

import com.ciq.entity.Product;

public interface ProductService {

	List<Product> findall();

	Product save(Product product);
}
