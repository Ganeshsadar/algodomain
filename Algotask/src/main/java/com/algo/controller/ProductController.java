package com.algo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algo.entity.Product;
import com.algo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping
	public void add(@RequestBody Product product) throws Exception {
		productService.add(product);
	}

	@PutMapping("/{productId}")
	public Product edit(@RequestBody Product product, @PathVariable Long productId) throws Exception {

		return productService.edit(product, productId);
	}

	@GetMapping("/{productId}")
	public Product getProduct(@PathVariable Long productId) throws Exception {
		return productService.getProduct(productId);
	}
	
	@DeleteMapping("/{productId}")
	public void delet(@PathVariable long productId) throws Exception
	{
		productService.delete(productId);
	}
}
