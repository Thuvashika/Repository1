package com.learn.java.chapter8.interfaceTry;

public interface Calculator {
	
	//all are final fields
	public static float pi=3.14f;
	public int var=1;
	public static final String Area="Square";
	public final int root4=2;
	
	//no final methods inside interface
	
	//public final void sum(int...arr); --illegal
	
	public int sum(int...arr);
	public int pro(int...arr) ;
		
	
	//static methods should not be incomplete
	//public static void add(int a,int b);
	
	//static methods are allowed in interface
	public static int add(int a,int b) {
		return a+b;
	}
	
	//public int sub(int a,int b)
	//public int sub(int a,int b) {}
	
	
	//default methods can have a body
	default int sub(int a,int b) {
		return a-b;
	}
	
}

