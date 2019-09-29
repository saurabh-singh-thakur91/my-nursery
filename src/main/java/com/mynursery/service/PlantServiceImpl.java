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
	public Plant findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plant save() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return null;
	}

}
