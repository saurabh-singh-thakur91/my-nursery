package com.mynursery.dao;

import java.util.List;

import com.mynursery.entity.Seeds;

public interface SeedsDAO {
	
	public List<Seeds> findAll();
	
	public Seeds findById(int seedsId);
	
	public Seeds save(Seeds seeds);
	
	public String delete(int seedsId);
	

}
