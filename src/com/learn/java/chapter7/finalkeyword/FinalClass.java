package com.learn.java.chapter7.finalkeyword;

public class FinalClass {
 
	//overloading of final methods are possible
	final void print(int a) {
		System.out.println(a);
	}
	
	//final methods are not overridden
	final void print() {
		System.out.println("No arguments");
	}

}
class Class2 extends FinalClass{
	//new method 
	void print(String s) {
		System.out.println("No arguments");
	}
	
	//void print()  --cannot be overridden
}