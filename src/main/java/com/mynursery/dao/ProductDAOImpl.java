package com.mynursery.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mynursery.entity.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Product> findAll() {
		/*
		 * Session acquired by using .getCurrentSession() is automatically flushed when
		 * the transaction gets over
		 */

		Session session = sessionFactory.getCurrentSession();

		TypedQuery<Product> query = session.createQuery("select p from Product p", Product.class);

		List<Product> productList = query.getResultList();

		return productList;
	}
}
