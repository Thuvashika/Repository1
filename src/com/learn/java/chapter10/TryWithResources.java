package com.learn.java.chapter10;

import java.io.PrintWriter;

public class TryWithResources {
	private static final String CLASS = "com.learn.java.chapter10";
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		try {
			method3();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
	static void method1() throws Exception {
		method2();
	}
	static void method2() throws Exception {
		try {
			Class.forName(CLASS);  //suppressed exception
		}finally {
			Class<Boolean> clazz = boolean.class; 
            clazz.newInstance();
		}
	}
	static void method3() throws Exception{
		try(PrintWriter pw=new PrintWriter("abc.txt");){
			Thread.sleep(1000);
		}
	}
}
