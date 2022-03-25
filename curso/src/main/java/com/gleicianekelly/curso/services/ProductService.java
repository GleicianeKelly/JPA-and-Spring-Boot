package com.gleicianekelly.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gleicianekelly.curso.entities.Product;
import com.gleicianekelly.curso.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> object = repository.findById(id);
		return object.get();
		
	}
	
}
