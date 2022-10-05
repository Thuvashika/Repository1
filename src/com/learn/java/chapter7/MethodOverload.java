package com.learn.java.chapter7;

class Demo {
	static int a=10,b=50;
	static {
		System.out.println("Demo");
	}
	//changing number of parameters
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	
	
	//changing type of parameters
	void findAscii(char a) {
		int c=a;
		System.out.println(a+"="+c);
	}
	void findAscii(int a) {
		System.out.println("It is a numerical value");
	}
	
	
	//order of parameter
	
	
	void display() {
		System.out.println("no arguments");
	}
	void display(int a) {
		System.out.println("int");
	}
	void display(Object o) {
		System.out.println("object");
	}
	void display(String s) {
		System.out.println("string");
	}
	//void display(Integer s) {     //Ambiguity
		
	//}
	
	//Type promotion
	
	void print(float a) {
		System.out.println(a);
	}
	
	//ambiguity
	void print(int a ,float b) {
		System.out.println(a+","+b);
	}
	void print(float a ,int b) {
		System.out.println(a+","+b);
	}
	
	
	//parent and child(similar data types)
	void address(Object O) {
		System.out.println(O);
	}
	void address(Demo O) {
		System.out.println(O);
	}
	void address(Demo this) {   //same as (Demo O) method
		System.out.println(this);
	}
	void address(MethodOverload O) {
		System.out.println(O);
	}
	//MethodOverload-->Demo-->Object 
	
	
	void tryMethod(MethodOverload obj) {
		System.out.println("Parent class Try method");
	}
	
	
}
class NewChild extends Demo{
	static {
		System.out.println("NewChild");
		b=100;
	}
}
public class MethodOverload extends Demo {
	static {
		System.out.println("MethoOverload");
		a=20;
	}
	void newMethod() {
		System.out.println("Child method");
	}
	
	void tryMethod(MethodOverload obj) {
		System.out.println("child class Try method");
	}

	public static void main(String[] args) {
		Demo obj=new Demo();
		
		obj.add(10, 20);//void add(int a,int b) is called
		obj.findAscii(10);//void findAscci(int a) is called
	    obj.display(10);//void display(String s) is called
		obj.display(20.4f);
		obj.display("String");
		obj.display(true);
		obj.display(null);
		obj.address(obj);
		MethodOverload obj2=new MethodOverload();
		
		//up casting
		Demo objNew=new MethodOverload();
		System.out.println(objNew.add(20, 30));//parent class method
		//objNew.newMethod(); --not able to access child class methods
		objNew.tryMethod(obj2); //overridden method
		
		
		//calling main method MethodOverload class is loaded
		System.out.println(Demo.b);
		System.out.println(Demo.a);
		
		
		//up casting--can only access parent class methods and overridden methods
		obj.address(obj2);//object of child class implicitly type promoted to parent class object
		obj.address();
		obj2.address();
		
		//down casting 
		//down casting only after up casting
		Demo newObj=new MethodOverload();
		MethodOverload newObj2=(MethodOverload)newObj;
		newObj2.tryMethod(newObj2);//overridden methods
		newObj2.newMethod();//child class method
		System.out.println(newObj2.add(10, 10));//parent class method
		
		//down casting--can access both parent and child class methods & overridden methods
		
		
		//obj.tryMethod((MethodOverload)obj);  //object of parent class cannot be used implicitly in the place of child class object
		
		int a=10;
		obj.print(a);  //void print(float a) is called even though the parameter is float...implicit type casting is done**/
	    
	}

}
