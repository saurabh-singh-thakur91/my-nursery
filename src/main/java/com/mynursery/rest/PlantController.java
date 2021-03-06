package com.mynursery.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mynursery.entity.Plant;
import com.mynursery.service.PlantService;

@RestController
@RequestMapping("/api/plants")
public class PlantController {
	@Autowired
	PlantService plantService;
	
	@GetMapping
	public List<Plant> findAll() {
		return plantService.findAll();
	}

	@GetMapping("/{plantId}")
	public Plant findById(@PathVariable int plantId) {
		return plantService.findById(plantId);
	}
	
	@PostMapping
	public Plant save(@RequestBody Plant plant) {
		plant.setId(0);
		return plantService.save(plant);
	}
	
	@PutMapping("/{plantId}")
	public Plant update(@RequestBody Plant plant, @PathVariable int plantId) {
		
		if(plant.getId() == 0) {
			plant.setId(plantId);
		}
		
		return plantService.save(plant);
	}
	
	@DeleteMapping("/{plantId}")
	public String delete(@PathVariable int plantId) {
		return plantService.delete(plantId);
	}
}
