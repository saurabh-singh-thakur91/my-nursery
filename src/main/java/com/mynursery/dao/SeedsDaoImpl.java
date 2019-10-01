package com.mynursery.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.mynursery.entity.Seeds;

public class SeedsDaoImpl implements SeedsDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Seeds> findAll() {
		Session session = sessionFactory.getCurrentSession();
		
		TypedQuery<Seeds> query = session.createQuery("select s from Seeds s", Seeds.class);
		
		List<Seeds> seeds = query.getResultList();
		
		return seeds;
	}

	@Override
	public Seeds findById(int seedsId) {
		Session session = sessionFactory.getCurrentSession();
		
		Seeds seeds = session.get(Seeds.class, seedsId);
		
		return seeds;
	}

	@Override
	public Seeds save(Seeds seeds) {
		Session session = sessionFactory.getCurrentSession();
		
		if(seeds.getId() == 0) {
			int id = (int) session.save(seeds);
			seeds.setId(id);
			
		}else {
			session.update(seeds);
		}
		
		return seeds;
	}

	@Override
	public String delete(int seedsId) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Seeds seeds = session.get(Seeds.class, seedsId);
		
		if(seeds == null)
			return "Seeds with id: " + seedsId + " not found.";
		
		return "Deleted seeds: " + seeds.toString() + " from the DB";
	}

}
