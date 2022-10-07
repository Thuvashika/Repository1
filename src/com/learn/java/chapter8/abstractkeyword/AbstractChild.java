package com.learn.java.chapter8.abstractkeyword;

public abstract class AbstractChild extends AbstractParent{
	AbstractChild(){
		//VAR1=20; --final variable cannot be changed
		VAR2='c';  //--AbstractParent class variable
	}
	
	
	public void display() {
		
		System.out.println("Abstract Child class display");
	}
	public abstract void view();
	
	//static methods inside abstract class
	public static void ClassName() {
		System.out.println("Abstract child class((static method)");      //method hiding
	}

	//Cannot override the final method
	//public final void ParentClassName(){}
}
