package com.learn.java.chapter8;
//import java.util.LinkedHashMap.*;
import com.learn.java.chapter8.abstractkeyword.*;

public class AbstractTrial {

	public static void main(String[] args){
		
		//Instance of the abstract class cannot be created
		AbstractParent obj1=new AbstractParent() {  //Anonymous class--singleton class
			public void display() {
				System.out.println("Anonymous display");
			}

			@Override
			public boolean equals(Object obj) {
				return false;
			}
			
		};
		
		obj1.display();
		System.out.println();
		System.out.println("AbstractParent:");
		System.out.println("VAR1:"+ obj1.VAR1);
		System.out.println("VAR2:"+ obj1.VAR2);
		System.out.println("VAR3:"+ obj1.VAR3);
		System.out.println();
		
		//if the constructor of the AbstractParent is default--still it is executed because it is called by GrandChild constructor
		AbstractParent obj=new GreatChild();   //Up casting
		
		obj.display(); //AbstractChild's(immediate parent of GreatChild) display method overrides AbstratParent's display method
		
		
		obj.ClassName(); //static methods cannot be overridden
		
		
		AbstractChild obj2=new GreatChild();
		
		
		obj2.ParentClassName();  //accessing final method
		
		
		
		
		GreatChild obj3=new GreatChild();
		System.out.println();
		System.out.println("GreatChild:");
		System.out.println("VAR1:"+ obj3.VAR1);
		System.out.println("VAR2:"+ obj3.VAR2);
		System.out.println("VAR3:"+ obj3.VAR3);
		
		
		//LinkedHashIterator obj=new LinkedHashIterator();  --default abstract class
		
		
	}

}
