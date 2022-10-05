package com.learn.java.chapter7.statickeyword;
import static java.util.Scanner.*;  
import static com.learn.java.chapter7.statickeyword.NewClass.*;
import static com.learn.java.self.GreatGreat.*;
import java.util.Scanner; //normal import required for creating object

import com.learn.java.self.GreatGreat;

//import static com.learn.java.self.GreatGreat.Days; --doubt

public class StaticImport {
	static String a="20";
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//print();--ambiguity in calling the same static method/variable 
		 
		trial();
		
		System.out.println(a); //first preference to the data in this class
		
		//to access the imported class members normal import needed for class outside the package
		System.out.println(GreatGreat.Days.Monday);
		
		System.out.println(Days.Monday);  //by static import
		
		//System.out.println(Monday);---Doubt
		
		
		//no need to import for the class in same package
		System.out.println(NewClass.a);
		
	}
	void trial1() {
		display();  //this.display--so no static display
	}
	void display() {  
	     System.out.println("Non static method");
	 }
		
}
