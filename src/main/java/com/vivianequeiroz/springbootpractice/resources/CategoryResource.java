package com.vivianequeiroz.springbootpractice.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivianequeiroz.springbootpractice.entities.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	// the method that will always be executed when a get request is made:

	@GetMapping
	public ResponseEntity<List<Category>> findAllCategories() {
		List<Category> list = new ArrayList<>();

		list.add(new Category(1L, "Eletronics"));
		list.add(new Category(2L, "Books"));

		return ResponseEntity.ok().body(list);
	}

	// @PathVariable Long id can be used when requesting a single object

	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findCategoryById(@PathVariable Long id) {
		Category categoryFound = (new Category(1L, "Eletronics"));
		return ResponseEntity.ok().body(categoryFound);
	}

}
