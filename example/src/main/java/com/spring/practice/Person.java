package com.spring.practice;

public class Person {
	
	private int id;
	private String name;
	private int empNo;
	private String empName;
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public static Person getInstance(int id,String name){
		System.out.println("Creating the Person instance using factory method");
		return new Person(id,name);
	}

	Person(int id,String name){
		this.id = id;
		this.name = name;
	}

	public void speak(){
		System.out.println("Hello! I am Person");
	}
	
	
	public int getId() {
		return id;
	}
	
	

	public void onCreate(){
		System.out.println("person created: "+this);
	}

	public void onDestroy(){
		System.out.println("person destoryed");
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", empNo=" + empNo + ", empName=" + empName + ", address="
				+ address + "]";
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
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
}
