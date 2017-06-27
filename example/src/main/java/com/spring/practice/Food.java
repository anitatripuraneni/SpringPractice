package com.spring.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Food {
	
	private Map<String,String> foods= new HashMap<>();
	private Map<String,Animal> animals = new HashMap<>();

	public Map<String, Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(Map<String, Animal> animals) {
		this.animals = animals;
	}

	public Map<String, String> getFoods() {
		return foods;
	}

	public void setFoods(Map<String, String> foods) {
		this.foods = foods;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Entry<String,String> entry:foods.entrySet()){
			sb.append(entry.getKey() +":"+entry.getValue());
			sb.append("\n");
		}
		
		for(Entry<String,Animal> entry1 : animals.entrySet()){
			sb.append(entry1.getKey() +":"+ entry1.getValue()+"\n");
		}
		
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animals == null) ? 0 : animals.hashCode());
		result = prime * result + ((foods == null) ? 0 : foods.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		if (animals == null) {
			if (other.animals != null)
				return false;
		} else if (!animals.equals(other.animals))
			return false;
		if (foods == null) {
			if (other.foods != null)
				return false;
		} else if (!foods.equals(other.foods))
			return false;
		return true;
	}

}
