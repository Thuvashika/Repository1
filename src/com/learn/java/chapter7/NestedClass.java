package com.learn.java.chapter7;
class B{
	void print() {
		System.out.println("Parent class");
	}
}
class Outer extends B{
	static int x=10;
	int a=10;
	void print() {
		System.out.println("outer class");
	}
	abstract class NewClass{
		static final int var = 10;
		// NestedInnerClass
		class NestedInnerClass{
			void print() {
				System.out.println("Nested Inner Class");
			}
			//local class
			Object method(int a) {
				class MethodLevel{
					int side=a;
					MethodLevel findArea() {
						System.out.println(side*side);
						return this;
					
					}
					public String toString() {
						return "Thuvashika";
					}
					
				}
				if(a<=1000) {
					MethodLevel newObj=new MethodLevel();
					return newObj.findArea();
				}
				return 0;
			}
		}
		
		
		abstract void print();  //abstract method 
		
		void createObj() {
			NestedInnerClass obj=new NestedInnerClass();
			Object newObj=obj.method(1000);
			System.out.println(newObj);
			Object objNew=obj.method(10000000);
			System.out.println(newObj.toString());
		}
	}
	private void display(int a) {
		System.out.println(a);  //accessed by inner class
	}
	public void newMethod() {
		System.out.println("Outer");
	}
	
	
	protected  class Inner extends B{
		int x,y;
		Inner(int x,int y){
			this.x=x;
			this.y=y;
		}
		//non static inner class does not contains static members
		//only top level class contains static members
		
		void add() {
			
			//System.out.println("inner class");
			
			
			display(x+y); //this calls outer class method
			
			print();//always this.print() is called so B.print is called
			
			
			newDisplay();  //can also access static members from inner class
		}
		public void newMethod() {
			System.out.println("Inner");
		}
	}
	
	static void newDisplay() {
		System.out.println("Static method");
	}
	
	static class StaticClass{
		//static class contains both static and non static members
		static void staticMethod() {
			System.out.println("Static class-static method");
		}
		void useOuterClassData() {
			System.out.println(x);
			newDisplay(); //can access static members from static inner class
			//newMethod();  can't able access non static members from static inner class
		}
	}
}
public class NestedClass extends com.learn.java.chapter7.Outer.Inner {

	NestedClass(Outer outer, int x, int y) {
		outer.super(x, y);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//creating outer class object
		Outer obj=new Outer();
		
		//inner class object is created by outer class object
		Outer.Inner innerObj=obj.new Inner(25,67);
		
		
		innerObj.add();
		innerObj.print(); //Parent class(Class B) print is called not Outer.print
		//we can't able to call Outer class method using inner class object
		innerObj.newMethod();  //inner class method is implemented
		
		Outer.NewClass anonyObj=obj.new NewClass() {
			void print() {
				System.out.println("Anonymous class"+ var);  //overriding print method
				display();
			}
			void display() {
				System.out.println("Anonymous class-method");
			}
		};
		
		anonyObj.createObj();
		anonyObj.createObj();
		
		anonyObj.print();// overridden method is called
		
		//static class object
		Outer.StaticClass staticObj=new Outer.StaticClass();  
		
		//non static data are accessed only after creating the object
		staticObj.useOuterClassData(); 
		
		//static members of static class can be accessed without creating an object
		Outer.StaticClass.staticMethod();
	}

}
