package com.spring.practice;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	
	private String id;
	private String name;
	
	
	
	/*@Inject
	public void setId(@Value("1234") int id) {
		this.id = id;
	}*/
	public String getName() {
		return name;
	}
	/*@Autowired
	public void setName(@Value("Anita")String name) {
		this.name = name;
	}*/
	
	public void speak(){
		System.out.println(id+":"+name);
	}
	
	public String getId() {
		return id;
	}
/*@Autowired
	public void setId(@Value("${user}")String id) {
		this.id = id;
	}
@Autowired
	public void setName(@Value("${password}")String name) {
		this.name = name;
	}*/

}
