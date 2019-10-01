package com.mynursery.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mynursery.entity.Seeds;

@RestController
@RequestMapping("/api/seeds")
public class SeedsController {
	
	@GetMapping
	public List<Seeds> findAll(){
		return null;
	}

}
