package com.gleicianekelly.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gleicianekelly.curso.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
