package com.klef.jfsd.exam.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_table")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private String productname;
	private int quantity;
	private LocalDate date;
	private int getOrderId() {
		return orderId;
	}
	private void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	private String getProductname() {
		return productname;
	}
	private void setProductname(String productname) {
		this.productname = productname;
	}
	private int getQuantity() {
		return quantity;
	}
	private void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	private LocalDate getDate() {
		return date;
	}
	private void setDate(LocalDate date) {
		this.date = date;
	}

}
