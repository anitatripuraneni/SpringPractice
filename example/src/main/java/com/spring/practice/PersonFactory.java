package com.spring.practice;

public class PersonFactory {
public Person createPerson(int id ,String name){
	System.out.println("creating Person from factory class");
	return new Person(id,name);
}
}
