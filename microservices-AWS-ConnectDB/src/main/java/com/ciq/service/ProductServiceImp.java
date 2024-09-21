package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.entity.Product;
import com.ciq.repo.ProductReposi;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	ProductReposi productReposi;

	@Override
	public List<Product> findall() {
		return productReposi.findAll();
	}

	@Override
	public Product save(Product product) {
		return productReposi.save(product);
	}

}
