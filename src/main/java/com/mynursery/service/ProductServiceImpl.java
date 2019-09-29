package com.mynursery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mynursery.dao.ProductDAO;
import com.mynursery.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDao;

	@Override
	@Transactional
	public List<Product> findAll() {
		return productDao.findAll();
	}

	@Override
	@Transactional
	public Product findById(int productId) {
		return productDao.findById(productId);
	}

	@Override
	@Transactional
	public Product save(Product product) {
		return productDao.save(product);
	}

	@Override
	@Transactional
	public void delete(int productId) {
		productDao.delete(productId);
	}

}
