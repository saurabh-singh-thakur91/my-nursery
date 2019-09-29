package com.mynursery.service;

import java.util.List;

import com.mynursery.entity.Plant;

public interface PlantService {
	
	public List<Plant> findAll();
	
	public Plant findById();
	
	public Plant save();
	
	public String delete();

}
