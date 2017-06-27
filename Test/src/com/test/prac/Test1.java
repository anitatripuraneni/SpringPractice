package com.test.prac;

public class Test1{
	public static void main(String[] args) {
		try{
			m1();
		}catch(IndexOutOfBoundsException e){
			System.out.println("1");
			throw new NullPointerException();
		}catch(NullPointerException n){
			System.out.println("2");
			return;
		}catch(Exception e1){
			System.out.println("3");
		}finally {
			System.out.println("4");
		}
		System.out.println("End");
	}
	static void m1(){
		System.out.println("m1");
		throw new IndexOutOfBoundsException("index");
	}
}