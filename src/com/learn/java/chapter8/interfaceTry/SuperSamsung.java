package com.learn.java.chapter8.interfaceTry;

public class SuperSamsung {
	public int mul(int a,int b) { //override to avoid compilation problem
		System.out.println("SuperSamsung mul method");
		
		return a*b;
	}
	public int sum(int... arr) {
		int sum=0;
		for(int a:arr) {
			sum+=a;
		}
		return sum;
		
	}
}
