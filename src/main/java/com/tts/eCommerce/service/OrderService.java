package com.tts.eCommerce.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.eCommerce.model.Order;
import com.tts.eCommerce.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public Order findByOrder(String order) {
		return orderRepository.findByOrder(order);
	}
	
    public Iterable<Order> getAllOrders() {
        return orderRepository.findAll();
    }
	
    
    public Order create(Order order) {
        order.setCreatedAt(new Date());
        return this.orderRepository.save(order);
    }
 
   
    public void update(Order order) {
        this.orderRepository.save(order);
    }
}
