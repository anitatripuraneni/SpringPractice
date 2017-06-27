package com.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathApp {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/practice/beans/beans.xml");
		
		Person p1 = (Person)con.getBean("person");
		Person p2 = (Person)con.getBean("person");
		p2.setEmpNo(666);
		Address a =(Address)con.getBean("address");
		Address a1=(Address)con.getBean("address1");
		
		System.out.println(p1);
		System.out.println(a1);
		System.out.println(p2);
		System.out.println(a);
		//p.speak();
((ClassPathXmlApplicationContext)con).close();
	}

}
