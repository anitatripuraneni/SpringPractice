package com.spring.practice;

import java.util.Random;

public class RamdomText {
	
	private static String[] texts = {
			"I'll get back","Get out!","I want your car"
	};
	
	public String getText(){
		Random r = new Random();
		return texts[r.nextInt(texts.length)];
		
	}

}
