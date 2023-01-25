package com.algo.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "charges")
public class Charges {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "charges_id", unique = true, nullable = false, updatable = false)
	private Long chargesId;

	@Column(name = "gst")
	private BigDecimal gst;

	@Column(name = "delivery")
	private BigDecimal delivery;

	public Long getChargesId() {
		return chargesId;
	}

	public void setChargesId(Long chargesId) {
		this.chargesId = chargesId;
	}

	public BigDecimal getGst() {
		return gst;
	}

	public void setGst(BigDecimal gst) {
		this.gst = gst;
	}

	public BigDecimal getDelivery() {
		return delivery;
	}

	public void setDelivery(BigDecimal delivery) {
		this.delivery = delivery;
	}

}
