package com.gleicianekelly.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gleicianekelly.curso.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
