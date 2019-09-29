package com.mynursery.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mynursery.entity.Product;
import com.mynursery.service.ProductService;

@RestController
@RequestMapping("/api/home")
public class HomeController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping
	public List<Product> findAll(){
		return productService.findAll();
	}
}
