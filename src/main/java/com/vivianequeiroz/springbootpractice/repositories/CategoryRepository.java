package com.vivianequeiroz.springbootpractice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vivianequeiroz.springbootpractice.entities.Category;

// an interface which objective is access and manipulate data from a specific entity

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
