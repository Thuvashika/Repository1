package com.learn.java.chapter10;

import java.util.Scanner;

//import java.io.FileNotFoundException;

public class FinallyDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		try {
			methodA(n);
		}
		catch(Exception e) {
			System.out.println("Handling exception");
		}
		finally {
			System.out.println("main method finally block");
		}
	}
	static void methodA(int n) {
		try {
			methodB(n);
		}
		catch(ArithmeticException e) {
			throw e;
		}
		finally {
			System.out.println("methodA finally block");
		}
	}
	static void methodB(int n){
		if(n<10) {
			System.out.println(10/0);
		}
	}
	
}
