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
}
