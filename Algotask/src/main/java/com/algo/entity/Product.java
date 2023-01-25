package com.algo.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id", unique = true, nullable = false, updatable = false)
	private Long productId;

	@Column(name = "name")
	private String name;

	@Column(name = "product_type")
	private String productType;

	@Column(name = "category")
	private String category;

	@Column(name = "base_price")
	private BigDecimal basePrice;

	@Column(name = "final_price")
	private BigDecimal finalPrice;

	@Column(name = "gst")
	private Long gst;

	@Column(name = "delivery")
	private BigDecimal delivery;

	@Column(name = "discount")
	private int discount;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public BigDecimal getBasePrice() {
		return basePrice;
	}

	public BigDecimal getDelivery() {
		return delivery;
	}

	public BigDecimal getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(BigDecimal finalPrice) {
		this.finalPrice = finalPrice;
	}

	public Long getGst() {
		return gst;
	}

	public void setGst(Long gst) {
		this.gst = gst;
	}

	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
	}

	public void setDelivery(BigDecimal delivery) {
		this.delivery = delivery;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

}
