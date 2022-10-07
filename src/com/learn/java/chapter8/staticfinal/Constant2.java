package com.learn.java.chapter8.staticfinal;

public class Constant2 extends Constant{
	
	/**
	 * 
	 * static final methods cannot be hidden
	static final void trialMethod() {
		System.out.println("trial method");
	}
	**/
	
	static final void view() {
		//Constant.className="Constant2"; --final fields cannot be changed
		System.out.println("view method");
		trialMethod();
		InnerClass.print();
		
	}
}
