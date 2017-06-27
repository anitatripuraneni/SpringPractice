package com.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAutoWireApp {
	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/practice/beans/Annotationbeans.xml");

		Writer1 w = (Writer1) con.getBean("writer1");

		w.writeFile("Write in file");
		w.writeConsole("Write in console");

		((ClassPathXmlApplicationContext) con).close();
	}
}
