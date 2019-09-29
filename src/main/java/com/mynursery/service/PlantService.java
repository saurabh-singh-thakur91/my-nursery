package com.mynursery.service;

import java.util.List;

import com.mynursery.entity.Plant;

public interface PlantService {
	
	public List<Plant> findAll();
	
	public Plant findById(int plantId);
	
	public Plant save(Plant plant);
	
	public String delete(int plantId);

}
