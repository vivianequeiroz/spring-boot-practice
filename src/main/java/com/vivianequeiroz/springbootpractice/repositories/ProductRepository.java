package com.vivianequeiroz.springbootpractice.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.vivianequeiroz.springbootpractice.entities.Product;

// a class which objective is access and manipulate data from a specific entity

// indicates it can be instantiated with @Autowired
@Component
public class ProductRepository {
	//a collection with a pair of key and value. It is easier to locale an obj through id
	private Map<Long, Product> map = new HashMap<>();

	public void save(Product obj) {
		map.put(obj.getId(), obj);
	}

	public Product findProductById(Long id) {
		return map.get(id);
	}
	
	public List<Product> findAllProducts() {
		return new ArrayList<Product>(map.values());
	}
}
