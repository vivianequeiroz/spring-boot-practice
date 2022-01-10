package com.vivianequeiroz.springbootpractice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vivianequeiroz.springbootpractice.entities.Product;

// a class which objective is access and manipulate data from a specific entity

// indicates it can be instantiated with @Autowired
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
