package com.spring.practice;

import java.util.List;

public class Jungle {
	private Animal largest;
	private List<Animal> animals;

	@Override
	public String toString() {
		return "Jungle [largest=" + largest + ", animals=" + animals + "]";
	}

	public Jungle(Animal largest, List<Animal> animals) {
		this.largest = largest;
		this.animals = animals;
	}

}
