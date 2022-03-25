package com.gleicianekelly.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gleicianekelly.curso.entities.Order;
import com.gleicianekelly.curso.entities.User;
import com.gleicianekelly.curso.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> object = repository.findById(id);
		return object.get();
		
	}
	
}
