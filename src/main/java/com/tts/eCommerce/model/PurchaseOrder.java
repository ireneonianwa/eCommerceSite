package com.tts.eCommerce.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "orders")

public class PurchaseOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private User user;

//	@OneToMany(mappedBy = "orders", cascade = CascadeType.ALL)
//	private List<HashMap<Product, Integer>> orderItems;

	private String cart;
	
	private String orderStatus;
	
	private double totalAmount;

	@CreationTimestamp
	private Date createdAt;


	public PurchaseOrder() {
	}


	public PurchaseOrder(User user, String cart, String orderStatus, double totalAmount, Date createdAt) {
		this.user = user;
		this.cart = cart;
		this.orderStatus = orderStatus;
		this.totalAmount = totalAmount;
		this.createdAt = createdAt;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getCart() {
		return cart;
	}


	public void setCart(String cart) {
		this.cart = cart;
	}


	public String getOrderStatus() {
		return orderStatus;
	}


	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}


	public double getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Long getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Order [id=" + id + ", user=" + user + ", cart=" + cart + ", orderStatus=" + orderStatus
				+ ", totalAmount=" + totalAmount + ", createdAt=" + createdAt + "]";
	}

	
	
	
	
}
