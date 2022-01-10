package com.vivianequeiroz.springbootpractice.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivianequeiroz.springbootpractice.entities.Category;
import com.vivianequeiroz.springbootpractice.repositories.CategoryRepository;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	// get automatically an instance of CategoryRepository
	@Autowired 
	private CategoryRepository categoryRepository;

	@GetMapping
	public ResponseEntity<List<Category>> findAllCategories() {
		List<Category> list = categoryRepository.findAllCategories();

		return ResponseEntity.ok().body(list);
	}

	// @PathVariable Long id can be used when requesting a single object

	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findCategoryById(@PathVariable Long id) {
		Category categoryFound = categoryRepository.findCategoryById(id);
		return ResponseEntity.ok().body(categoryFound);
	}

}
