package com.algo.serviceimpl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algo.entity.Product;
import com.algo.repo.ProductRepo;
import com.algo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productRepo;

	@Override
	public void add(Product product) throws Exception {
		productRepo.save(product);

	}

	@Override
	public Product edit(Product product, Long productId) throws Exception {
		Product checkProduct = getProduct(productId);
		checkProduct.setBasePrice(product.getBasePrice());
		checkProduct.setCategory(product.getCategory());
		checkProduct.setName(product.getName());
		checkProduct.setProductType(product.getProductType());

		return productRepo.save(checkProduct);
	}

	@Override
	public void delete( Long productId) throws Exception {
		Product product = productRepo.findById(productId).orElseThrow(() -> new Exception("Product not found"));
		productRepo.delete(product);
	}

	@Override
	public Product getProduct(Long productId) throws Exception {

		Product product = productRepo.findById(productId).orElseThrow(() -> new Exception("Product not found"));

		if (product.getCategory().equals("electronice")) {

			Double amount = product.getBasePrice().doubleValue() * 18 / 100;

			Double total = product.getBasePrice().doubleValue() + amount;

			Double finalAmount = total - (total * 15 / 100);

			product.setFinalPrice(BigDecimal.valueOf(finalAmount));

		} else if (product.getCategory().equalsIgnoreCase("Home appliances")) {
			Double amount = product.getBasePrice().doubleValue() * 24 / 100;

			Double total = product.getBasePrice().doubleValue() + amount;

			Double finalAmount = total - (total * 22 / 100);
			product.setFinalPrice(BigDecimal.valueOf(finalAmount));
		} else if (product.getCategory().equalsIgnoreCase("Clothing")) {
			Double amount = product.getBasePrice().doubleValue() * 12 / 100;

			Double total = product.getBasePrice().doubleValue() + amount;

			Double finalAmount = total - (total * 40 / 100);

			product.setFinalPrice(BigDecimal.valueOf(finalAmount));
		} else if (product.getCategory().equalsIgnoreCase("Forniture")) {
			Double amount = product.getBasePrice().doubleValue() * 18 / 100;

			Double total = product.getBasePrice().doubleValue() + amount;

			Double finalAmount = total - (total * 10 / 100);

			product.setFinalPrice(BigDecimal.valueOf(finalAmount));
		}
		return product;
	}

}
