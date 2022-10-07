package com.learn.java.chapter8.abstractkeyword;

abstract class OuterAbstract { //abstract class can also be outer class
	
	class InnerClass1{
		public void getClassName() {
			System.out.println("Inner class 1");
		}
	}
	static abstract class InnerClass2{
		void print() {
			System.out.println("Inner class 2 print method");
		}
		abstract void display();
	}
	
	//static class only extend static class
	//static abstract class is possible
	static abstract class InnerClass3 extends OuterAbstract.InnerClass2{
		static void view() {
			System.out.println("Inner class 3 view method");
		}
	}
}
class OuterAbstract2 extends OuterAbstract{
	public void access() {
		NewInnerClass1 obj =new NewInnerClass1();
		obj.display();
		InnerClass1 obj2=new InnerClass1();
		obj2.getClassName();
	}
	class NewInnerClass1 extends OuterAbstract.InnerClass3{
		void display() {
			System.out.println("New Inner class 1 display method");
			super.print();
			super.view();
		}
	}
}
public abstract class NestedAbstract {
	public static void main(String[] args) {
		OuterAbstract2 obj1 =new OuterAbstract2();
		obj1.access();
		
	}
}