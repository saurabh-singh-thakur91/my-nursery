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

		Session session = sessionFactory.getCurrentSession();

		Plant plant = session.get(Plant.class, plantId);

		return plant;
	}

	@Override
	public Plant save(Plant plant) {
		
		Session session = sessionFactory.getCurrentSession();
		
		if(plant.getId() == 0) {
			// assign the newly created identity
			int id = (int) session.save(plant);
			
			plant.setId(id);
			
		}else {
			session.update(plant);
		}

		return plant;
	}

	@Override
	public String delete(int plantId) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Plant plant = session.get(Plant.class, plantId);
		
		if(plant == null)
			return "Plant with id: " + plantId + " not found.";
		
		return "Deleted plant: " + plant.toString() + " from the DB";
	}

}
