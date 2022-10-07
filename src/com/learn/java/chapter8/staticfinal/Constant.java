package com.learn.java.chapter8.staticfinal;

//static final class Constant1{}  --outer class cannot be static

public class Constant {
	//static final String className1; --must be initialized while declaring
	
	static final String className="Constant";
	static final void trialMethod() {
		System.out.println("trial method");
	}
	
	//nested class can be static final
	static final class InnerClass{
		
		static final void print() {
			System.out.println("print method");
		}
	}

}
