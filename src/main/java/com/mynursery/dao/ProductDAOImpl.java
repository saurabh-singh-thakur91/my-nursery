package com.mynursery.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mynursery.entity.Product;

@Repository
public class ProductDAOImpl implements ProductDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Product> findAll() {
		
		Session session =  sessionFactory.getCurrentSession();
		
		Query<Product> theQuery = session.createQuery("from Product", Product.class);
		
		List<Product> productList = theQuery.getResultList();
		
		return productList;
	}

	@Override
	public Product findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

}
