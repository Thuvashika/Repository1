package com.learn.java.chapter8.abstractkeyword;

import com.learn.java.chapter8.interfaceTry.Calculator;


//abstract class can also implement interface
abstract class AbstractTryA implements Calculator{
	
	//native methods are allowed inside abstract class
	//public native void m1();
	
	//native methods cannot be abstract
	//public native abstract void m1();  --illegal
	
	//abstract method cannot be final
	//public abstract final void print(); --illegal
	
	//abstract method cannot be static
	//public static abstract void print();  --illegal
}


//abstract class can be created without abstract methods
//Cannot instantiate the type AbstractTryB
abstract class AbstractTryB{
	
	//illegal modifier for field value
	//abstract keyword is not used for variables
	//abstract int value;  
	
	
}

//a class cannot be both final and abstract
//final abstract class AbstractTryC


//super class is always a class(Abstract/concrete) but not interface
abstract class AbstractTryC extends GreatChild{
	
	
}


public class GreatChild extends AbstractChild{
	public static int VAR1;  //--new variable not the variable of AbstractParent
	static {
		VAR1=90;
	}
	{
		int VAR3=100; //new variable
	}
	public GreatChild(){
		super();  //implicitly called
	}
	public void view() {
		System.out.println("Great Child class view");
	}
	
	public boolean equals() {    //Overriding not takes place ---same method signature
		 return true;
	 }
	
	public boolean equals(Object obj) {  
		 return true;
	 }
}
