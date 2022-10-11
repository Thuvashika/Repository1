package com.learn.java.chapter8.abstractkeyword;

public abstract class AbstractClassWithMain {
	public static void trialMethod() {
		System.out.println("Trial Method");
	}
	//public abstract void method2();
	
	public void method3() {
		System.out.println("Method 3");
	}
	
	public static void main(String[] args) {
		trialMethod();
		AbstractClassWithMain obj=new AbstractClassWithMain() {
			
		};
		obj.method3();
	}
}
