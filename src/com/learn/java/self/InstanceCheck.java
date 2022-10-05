package com.learn.java.self;
class A{
	
}
class B{
	
}
class C extends A{
	
}
public class InstanceCheck {

	public static void main(String[] args) {
		C obj=new C();
		String s="Hello";
		int len=s.length();
		System.out.println(obj instanceof A);   //used only in inheritance
		System.out.println(obj instanceof C);
		
		//System.out.println(obj instanceof B);  cannot be for Incompatible conditions 
		A obj1=new A();
		System.out.println(obj1 instanceof C);
	}

}
