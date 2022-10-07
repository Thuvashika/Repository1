package com.learn.java.chapter8.interfaceTry;

public class Samsung implements Mobile {

	@Override
	public int sum(int... arr) {
		int sum=0;
		for(int a:arr) {
			sum+=a;
		}
		return sum;
		
	}

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

}
