package com.mynursery.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mynursery.dao.ProductDAO;
import com.mynursery.entity.Plant;
import com.mynursery.entity.Product;

@RestController
@RequestMapping("/api")
public class PlantsController {
	
	@Autowired
	ProductDAO productDao;

	@GetMapping("/plants")
	public List<Product> findAll() {
		return productDao.findAll();
	}

	@GetMapping("/plants/{plantId}")
	public Plant findById(@PathVariable int plantId) {
		// TODO: consume plantId here

		return null;
	}
}
