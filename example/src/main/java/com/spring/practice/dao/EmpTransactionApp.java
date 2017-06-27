package com.spring.practice.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTransactionApp {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/practice/beans/DaoBeans.xml");
		TransactionsDao empDao3 =(TransactionsDao)con.getBean("transactionsDao");
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(7,"nani","nani@xyz.com","nani address"));
		empList.add(new Employee(2,"cherry","cherry@xyz.com","cherry address"));
		
		int[] values = empDao3.batchUpdate(empList);
		for(int i :values){
		System.out.println("updated:" +i+" rows.");
		}
		

	}

}
