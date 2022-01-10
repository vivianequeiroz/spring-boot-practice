package com.vivianequeiroz.springbootpractice.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.vivianequeiroz.springbootpractice.entities.Category;

// a class which objective is access and manipulate data from a specific entity

// indicates it can be instantiated with @Autowired
@Component
public class CategoryRepository {
	//a collection with a pair of key and value. It is easier to locale an obj through id
	private Map<Long, Category> map = new HashMap<>();

	public void save(Category obj) {
		map.put(obj.getId(), obj);
	}

	public Category findCategoryById(Long id) {
		return map.get(id);
	}
	
	public List<Category> findAllCategories() {
		return new ArrayList<Category>(map.values());
	}
}
