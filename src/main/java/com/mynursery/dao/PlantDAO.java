package com.mynursery.dao;

import java.util.List;

import com.mynursery.entity.Plant;

public interface PlantDAO {
	
	public List<Plant> findAll();
	
	public Plant findById(int plantId);
	
	public Plant save(Plant plant);
	
	public String delete(int plantId);

}
