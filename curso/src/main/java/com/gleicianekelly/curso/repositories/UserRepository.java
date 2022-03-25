package com.gleicianekelly.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gleicianekelly.curso.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
