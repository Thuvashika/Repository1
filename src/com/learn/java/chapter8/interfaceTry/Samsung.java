package com.learn.java.chapter8.interfaceTry;

public class Samsung extends SuperSamsung implements Mobile,NewInterface {

	
	//public int sum(int... arr) no need to override if its parent class has this method
	
	
	@Override
	public int pro(int... arr) {
		int pro=1;
		for(int a:arr) {
			pro*=a;
		}
		return pro;
	}
	
	@Override
	public void display() {
		System.out.println("good display");
	}

	@Override
	public void keypad() {
		System.out.println("keys");
		
	}
	
	//static methods of interface can also be implemented as non static method
	public int add(int a,int b) {
		return a+b;
	}

	public int sub(int a,int b) {  //we can also override default method
		System.out.println("Samsung sub method");
		return a-b;
		
	}

	
}
