package com.spring.practice.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpHibApp {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/practice/beans/DaoBeans.xml");
		EmployeeDao emp = (EmployeeDao) con.getBean("employeeDao");
		List<Employee> empList = emp.empDetails();
		empList.forEach(employee -> System.out.println("Employee [ id: " + employee.getId() + " name: "
				+ employee.getName() + " email: " + employee.getEmail() + " text: " + employee.getText() + "]"));

		/*for (Employee empdetails : empList) {
			System.out.println("Employee [ id: " + empdetails.getId() + " name: " + empdetails.getName() + " email: "
					+ empdetails.getEmail() + " text: " + empdetails.getText() + "]");

		}
*/
	}

}
