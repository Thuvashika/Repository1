package com.learn.java.chapter8;

import com.learn.java.chapter8.interfaceTry.Calculator;
import com.learn.java.chapter8.interfaceTry.Mobile;
import com.learn.java.chapter8.interfaceTry.Samsung;

public class InterfaceTrial {
	public static void main(String[] args) {
		Samsung obj=new Samsung();
		Calculator.add(10, 10);
		Mobile.print();
		
		//defaults methods can also be accessed from outside the package
		obj.sub(20, 10);
		
		obj.sum(1,2,3,4,5,6,7,8,9,10);
		obj.pro(1,2,3,4,5,6,7,8,9,10);
		obj.display();
		obj.keypad();
		//obj.print(); --interface static methods cannot be accessed through instance
		
		Mobile.print();
	}

}
