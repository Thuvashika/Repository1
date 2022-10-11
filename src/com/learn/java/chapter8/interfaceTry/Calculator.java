package com.learn.java.chapter8.interfaceTry;

public interface Calculator {
	
	//default boolean equals(Object obj) { }  //A default method cannot override a method from java.lang.Object 
	
	
	 //public boolean equals(Object obj);
	 
	 
	/**
	 {
	  interfaces don't have instance blocks
	 }
	 */
	/**
	 Calculator(){
		interfaces don't have constructors
	}
	**/
	
	
	/**
	static {
		interfaces don't have static blocks
	}
	**/
	
	
	/**static boolean equals(Object obj) {
		return false;
	}**/
	
	
	//all are final fields
	public static float pi=3.14f;
	public int var=1;
	public static final String Area="Square";
	public final int root4=2;
	
	//no final methods inside interface
	
	//public final void sum(int...arr); --illegal
	
	int sum(int...arr);
	
	int pro(int...arr) ;  //abstract,default,static methods---implicitly public in interface
	//static methods should not be incomplete
	//public static void add(int a,int b);
	
	//static methods are allowed in interface
	public static int add(int a,int b) {
		return a+b;
	}
	
	//public int sub(int a,int b)
	//public int sub(int a,int b) {}
	
	
	//default methods must have a body
	default int sub(int a,int b) {
		System.out.println("Calculator default sub method");
		return a-b;
	}
	
	
	public static void main(String[] args) {
		System.out.println("print");
	}
	
	default int mul(int a,int b) {
		System.out.println("Calculator mul method");
		return a*b;
	}
	default int div(int a,int b) {
		return a/b;
	}
	
}


