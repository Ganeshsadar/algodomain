package com.algo.service;

import com.algo.entity.Product;

public interface ProductService {

	void add(Product product) throws Exception;

	Product edit(Product product, Long productId) throws Exception;

	void delete(Long productId) throws Exception;

	Product getProduct(Long productId) throws Exception;
}
