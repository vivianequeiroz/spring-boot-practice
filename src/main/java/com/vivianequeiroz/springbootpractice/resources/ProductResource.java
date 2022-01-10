package com.vivianequeiroz.springbootpractice.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivianequeiroz.springbootpractice.entities.Product;
import com.vivianequeiroz.springbootpractice.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	// get automatically an instance of ProductRepository
	@Autowired
	private ProductRepository productRepository;

	@GetMapping
	public ResponseEntity<List<Product>> findAllProducts() {
		List<Product> productsList = productRepository.findAll();

		return ResponseEntity.ok().body(productsList);
	}

	// @PathVariable Long id can be used when requesting a single object

	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findProductById(@PathVariable Long id) {
		Product productFound = productRepository.findById(id).get();

		return ResponseEntity.ok().body(productFound);
	}

}
