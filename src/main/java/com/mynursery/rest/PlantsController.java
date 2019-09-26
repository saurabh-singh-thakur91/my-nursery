package com.mynursery.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mynursery.entity.Plant;

@RestController
@RequestMapping("/api")
public class PlantsController {

	private List<Plant> plants = new ArrayList<>();

	// @PostConstruct to load the data, called only once when the bean is created

	@PostConstruct
	public void loadData() {
		Plant plant1 = new Plant();
		plant1.setId(1);
		plant1.setName("Lemon grass");
		plant1.setDescription(
				"Lemon Grass is a fragrant herb which is increasingly being used in teas, beverages, herbal medicines.");
		plant1.setUnits(10);
		plant1.setPrice(300);

		Plant plant2 = new Plant();
		plant2.setId(2);
		plant2.setName("Long pepper, pipalli plant");
		plant2.setDescription(
				"Black Pepper, Kali mirch,Piper nigrum, white pepper, green pepper, peppercorn, Madagascar pepper, pippali,,milagu.");
		plant2.setUnits(20);
		plant2.setPrice(500);
		
		plants.add(plant1);
		plants.add(plant2);
	}

	@GetMapping("/plants")
	public List<Plant> findAll() {
		return plants;
	}

	@GetMapping("/plants/{plantId}")
	public Plant findById(@PathVariable int plantId) {
		// TODO: consume plantId here

		return plants.get(0);
	}
}
