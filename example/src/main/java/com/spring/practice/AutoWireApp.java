package com.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireApp {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/practice/beans/beans.xml");
		
		Writer w =(Writer)con.getBean("writer");
		w.writeFile("Write in file");
		w.writeConsole("Write in console");

	}

}
		