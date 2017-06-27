package com.spring.practice;

import org.springframework.beans.factory.annotation.Qualifier;

//@Qualifier("fileWriter")
public interface LogWriter {
	
	public void write(String write);

}
