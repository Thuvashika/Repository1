package com.learn.java.chapter8;

import com.learn.java.chapter8.abstractkeyword.AbstractParent;

public class NewAbstractClass extends AbstractParent{

	@Override
	public void print() {
		super.print();
	}
	public void display() {
		
		//Cannot directly invoke the abstract method display() for the type AbstractParent
		//super.display();
		
		System.out.println("Child class");
		
	}
	public void view() {
		display();
	}
	
	@Override
	public boolean equals(Object obj) {
		return false;
	}
	
}