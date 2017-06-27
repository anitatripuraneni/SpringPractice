package com.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListApp {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/practice/beans/beans.xml");
		
		FruitBasket fs = (FruitBasket)con.getBean("fruitBasket");
		
		Jungle j = (Jungle)con.getBean("jungle");
		
		Food f = (Food)con.getBean("food");
		//System.out.println(fs);
		System.out.println(j);
		System.out.println(f);
		System.out.println(f.equals("Banana"));
		System.out.println(f.hashCode());
		

	}

}
