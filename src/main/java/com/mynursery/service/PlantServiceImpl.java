package com.mynursery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mynursery.dao.PlantDAO;
import com.mynursery.entity.Plant;

@Service
public class PlantServiceImpl implements PlantService {
	
	@Autowired
	PlantDAO plantDao;

	@Override
	@Transactional
	public List<Plant> findAll() {
		return plantDao.findAll();
	}

	@Override
	@Transactional
	public Plant findById(int plantId) {
		return plantDao.findById(plantId);
	}

	@Override
	@Transactional
	public Plant save(Plant plant) {
		return plantDao.save(plant);
	}

	@Override
	@Transactional
	public String delete(int plantId) {
		return plantDao.delete(plantId);
	}

}
