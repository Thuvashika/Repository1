package com.learn.java.chapter7.statickeyword;
import static com.learn.java.chapter7.statickeyword.StaticImport.*;



/**
 * import com.learn.java.chapter7.Outer2.*;
 * import static Outer2.StaticClass  ---Not possible
 */


import static com.learn.java.chapter7.Outer2.*;
//import static com.learn.java.chapter7.Outer2.StaticClass.*; ---can be used to use only staticMethod() without class name

import static com.learn.java.chapter7.statickeyword.Days.*;
public class StaticImport2 {
	 public String toString() {
	        return getClass().getName() ;
	    }
	public static void main(String[] args) {
		//trial(); --not able to call the static import methods of static import class
		//System.out.println(b); --and static variables
		System.out.println(a);  //--only static import class static members be accessed
		
		//StaticImport.trial(); --not able to call with the imported class name 
		System.out.println(Days.Monday);
		System.out.println(Monday);
		
		
		StaticClass.staticMethod(); //static class can also be accessed 
		
		
		StaticImport2 obj=new StaticImport2();
		System.out.println(obj.toString());
		System.out.println(obj);
	}

}
//com.learn.java.chapter7.statickeyword.StaticImport@15db9742