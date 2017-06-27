package com.spring.practice;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter implements LogWriter {

	@Override
	public void write(String write) {
		System.out.println("Write to console: "+write);
	}

}
