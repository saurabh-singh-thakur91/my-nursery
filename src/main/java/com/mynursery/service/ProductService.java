package com.mynursery.service;

import java.util.List;

import com.mynursery.entity.Product;

public interface ProductService {

	public List<Product> findAll();

	public Product findById(int productId);

	public Product save(Product product);

	public void delete(int productId);

}
