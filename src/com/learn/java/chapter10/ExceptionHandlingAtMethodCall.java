package com.learn.java.chapter10;

import java.util.Objects;

public class ExceptionHandlingAtMethodCall {
	public static void main(String[] args) {
		call();
	}
	static void call() {
		try{
			try {
				newCall();
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index Out Of Bounds Exception");
			}
		}
		catch (ArithmeticException e) {
			System.out.println("Abnormal termination of newCall method");
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("The String is null");
		}
	}
	static void newCall() {
		//String n=null;
		//Objects.requireNonNull(n);
		System.out.println(10/0);
		System.out.println("new call method");
	}
}