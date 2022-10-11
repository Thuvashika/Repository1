package com.learn.java.chapter8;

import com.learn.java.chapter8.interfaceTry.Calculator;
import com.learn.java.chapter8.interfaceTry.Mobile;
import com.learn.java.chapter8.interfaceTry.Samsung;

public class InterfaceTrial {
	public static void main(String[] args) {
		Samsung obj=new Samsung();
		Calculator.add(10, 10);
		Mobile.print();
		
		obj.sum(1,2,3,4,5,6,7,8,9,10);
		obj.pro(1,2,3,4,5,6,7,8,9,10);
		obj.display();
		obj.keypad();
		//obj.print(); --interface static methods cannot be accessed through instance
		
		Mobile.print();
		System.out.println(obj.equals(obj));
		System.out.println(obj.add(0, 0));  //calls instance method
		System.out.println(Calculator.add(0, 0)); //calls static method
		
		System.out.println(obj.div(10,2)); //calls interface method(default)
		System.out.println(obj.mul(2,5)); //calls SuperSamsung method
		
		Calculator obj2 =new Samsung();
		obj2.mul(4, 5);  //calls implemented class's parent method
		obj2.sub(100,50); //calls overridden class method
		obj.sub(100, 50); //calls overridden class method
		System.out.println(obj2.equals(obj2));
		System.out.println(obj2.toString());
		System.out.println(obj2.sum(1,2,3,4,5));
	}

}
