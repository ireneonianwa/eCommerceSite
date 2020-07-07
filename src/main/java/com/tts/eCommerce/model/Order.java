package com.tts.eCommerce.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

public class Order {
	
	private List<Order> order;
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private Long id;
	
	@NotBlank(message = "Product name cannot be blank")
	private String name;
	
	@PositiveOrZero(message = "Product wholesale price cannot be negative")
	private Double wholesalePrice;
	
	@PositiveOrZero(message = "Product retail price cannot be negative")
	private Double retailPrice;
	
	@NotBlank(message = "Product brand cannot be blank")
	private String brand;
	
	
	private String description;
	private Integer inventory; // range between 0 to positive
	private String image; //image attribute is a string representing the path where the image file is stored
	
	@CreationTimestamp
	private Date createdAt;
	
	@UpdateTimestamp
	private Date updatedAt;

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(List<Order> order, @NotBlank(message = "Product name cannot be blank") String name,
			@PositiveOrZero(message = "Product wholesale price cannot be negative") Double wholesalePrice,
			@PositiveOrZero(message = "Product retail price cannot be negative") Double retailPrice,
			@NotBlank(message = "Product brand cannot be blank") String brand, String description, Integer inventory,
			String image, Date createdAt, Date updatedAt) {
		this.order = order;
		this.name = name;
		this.wholesalePrice = wholesalePrice;
		this.retailPrice = retailPrice;
		this.brand = brand;
		this.description = description;
		this.inventory = inventory;
		this.image = image;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getWholesalePrice() {
		return wholesalePrice;
	}

	public void setWholesalePrice(Double wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}

	public Double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(Double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getInventory() {
		return inventory;
	}

	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
	}
	
	
	
	
}
