package com.spring.practice;

import java.util.List;

public class FruitBasket {
	
	private String name;
	private List<String> fruits;
	
	public FruitBasket(String name,List<String> fruits){
		this.name = name;
		this.fruits = fruits;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append("\n");
		for(String fruit:fruits){
			sb.append(fruit);
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
	
	

}
