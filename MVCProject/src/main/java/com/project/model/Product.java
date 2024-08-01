package com.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ProductCURD")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Product_ID")
	private int productID;
	
	@Column(name="Name")
	private String productName;
	
	@Column(name="Description")
	private String description;
	
	@Column(name="Price")
	private Long price;

	public Product(int productID, String productName, String description, Long price) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.description = description;
		this.price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", description=" + description
				+ ", price=" + price + "]";
	}

}
