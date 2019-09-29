package com.mynursery.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mynursery.entity.Plant;

@Repository
public class PlantDAOImpl implements PlantDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Plant> findAll() {
		
		Session session = sessionFactory.getCurrentSession();
		
		TypedQuery<Plant> query = session.createQuery("select p from Plant p", Plant.class);
		
		List<Plant> plants = query.getResultList();
		
		return plants;
	}

	@Override
	public Plant findById(int plantId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plant save(Plant plant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(int plantId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
