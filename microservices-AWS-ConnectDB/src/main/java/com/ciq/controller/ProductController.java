package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.entity.Product;
import com.ciq.service.ProductService;

@RestController
@RequestMapping("/map")
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/get")
	public List<Product> FindAll() {
		return productService.findall();
	}

	@PostMapping
	public Product save(@RequestBody Product product) {
		return productService.save(product);

	}
}
