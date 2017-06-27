package com.spring.practice;

import org.springframework.stereotype.Component;

@Component
public class FileWriter implements LogWriter {

	@Override
	public void write(String write) {
		System.out.println("Write to file: "+ write);
		
	}

}
