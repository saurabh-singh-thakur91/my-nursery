package com.mynursery.entity;

import java.util.List;

public class Plant {
	
	private int id;
	
	private String name;
	
	private String description;
	
	private int units;
	
	private float price;
	
	private List<String> images;
	
	public Plant() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	@Override
	public String toString() {
		return "Plant [id=" + id + ", name=" + name + ", description=" + description + ", units=" + units + ", price="
				+ price + ", images=" + images + "]";
	}
	
	
}
