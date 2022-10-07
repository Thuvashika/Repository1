package com.learn.java.chapter8.abstractkeyword;

//class with at least one abstract method is called abstract class
public abstract class AbstractParent{
	public final int VAR1;
	public static char VAR2;
	public final int VAR3;
	
	{
		VAR1=10;
		VAR2='p';
		VAR3=10;
	}
	
	
	//constructors are allowed
	public AbstractParent(){
		System.out.println("AbstractParent class(Constructor)");
	}
	
	
	
	public void print() {
		System.out.println("Abstract Parent class print");
	}
	
	public abstract boolean equals(Object obj); //Parent class method can also be made as abstract
	
	public abstract void display();
	
	//The abstract method can only set a visibility modifier
	//private abstract void display();   //--not possible
	
	
	//final methods inside abstract class
	public final void ParentClassName(){
		System.out.println("Object class");
	}
	
	public static void ClassName() {
		System.out.println("Abstract parent class(static method)");
	}
}
