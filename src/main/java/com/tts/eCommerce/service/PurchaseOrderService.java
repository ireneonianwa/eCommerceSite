package com.tts.eCommerce.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.eCommerce.model.PurchaseOrder;
import com.tts.eCommerce.repository.PurchaseOrderRepository;

@Service
public class PurchaseOrderService {
	
	@Autowired
	private PurchaseOrderRepository orderRepository;
	
	public PurchaseOrder findByOrder(String order) {
		return orderRepository.findByOrder(order);
	}
	
    public Iterable<PurchaseOrder> getAllOrders() {
        return orderRepository.findAll();
    }
	
    
    public PurchaseOrder create(PurchaseOrder order) {
        order.setCreatedAt(new Date());
        return this.orderRepository.save(order);
    }
 
   
    public void update(PurchaseOrder order) {
        this.orderRepository.save(order);
    }
}
