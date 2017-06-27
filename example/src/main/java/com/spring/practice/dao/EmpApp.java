package com.spring.practice.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApp {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/practice/beans/DaoBeans.xml");
		
		BasicDataSource bs =(BasicDataSource)con.getBean("dataSource");
		System.out.println(bs.getUrl());
		System.out.println(bs.getDriverClassName());
		EmployeeDao empDao1 = (EmployeeDao) con.getBean("employeeDao");
		
		NamedEmployeeDao empDao2 = (NamedEmployeeDao) con.getBean("namedEmployeeDao");
		UpdateEmployeeDao empDao3 =(UpdateEmployeeDao)con.getBean("updateEmployeeDao");
		try{
			List<Employee> emps = empDao1.employeesDetails();
			
			for (Employee emp : emps) {
				System.out.println("Employee [ id: " + emp.getId() + " name: " + emp.getName() + " email: " + emp.getEmail()
						+ " text: " + emp.getText()+"]");
				
				Employee emp1 = empDao2.employeesDetails(2);
				System.out.println("Employee [ id: " + emp1.getId() + " name: " + emp1.getName() + " email: " + emp1.getEmail()
				+ " text: " + emp1.getText()+"]");
				
				
				List<Employee> empList = new ArrayList<>();
				Employee emp3=new Employee("nani","nani@xyz.com","nani address");
				Employee emp4 = new Employee("cherry","cherry@xyz.com","cherry address");
				Employee emp5 = new Employee("chotu","chotu@xyz.com","chotu address");
				Employee emp6 = new Employee("ani","ani@xyz.com","ani address");
				empList.add(emp3);
				empList.add(emp4);
				empList.add(emp5);
				empList.add(emp6);
				
				System.out.println(empDao3.create(emp3));
				System.out.println(empDao3.create(emp4));
				System.out.println(empDao3.update(emp3));
				
				int[] values = empDao3.batchUpdate(empList);
				for(int i :values){
				System.out.println("updated:" +i+" rows.");
				}
				
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
		}

		
		
		((ClassPathXmlApplicationContext) con).close();

	}

}
