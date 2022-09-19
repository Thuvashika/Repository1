package com.learn.java.chapter6;


// is a relation
public class Human extends Animal {
	int hands,legs;
	String colour;
	Human(){
		System.out.println("Reusing constructor");
	}
	Human(int hands,int legs,String colour){
		this();//reusing constructor
		this.hands=hands;
		this.legs=legs;
		this.colour=colour;
	}
	void organs() {
		//has a relation 
		Heart heart=new Heart();
		System.out.println("Heart:");
		heart.bloodPressure();
		heart.pump();
	}

}
