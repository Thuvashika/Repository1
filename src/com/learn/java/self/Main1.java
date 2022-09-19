package com.learn.java.self;

class Parent1{
    public int a; 
    Parent1(){
        
   }
    Parent1(char c){
        System.out.println("Parent000");
    }
    Parent1(int a){
        this.a=5;
        System.out.println("Parent");
    }
    void print() {
    	System.out.println("no");
    }
}
class Child1 extends Parent1{
	//all child constructor implicitly call parent constructor without arguments.
	Child1(){
		class Child2{
			void display() {
				System.out.println("Constructor class");
			}
		}
		Child2 obj=new Child2();
		obj.display();
	}
    Child1(int c){//implicit type casting
    	
    	//explicitly calling parameterized parent constructor
    	super(c);
    	
        System.out.println("Child");
    }
    void display() {
    	System.out.println("yes");
    }
}
public class Main1
{
	public static void main(String[] args) {
		Child1 obj=new Child1('a');
		//while creating an child class object both parent and child class constructor execute
		
		Parent1 obj2=new Child1();
		obj2.print();
		
		//can only access parent class methods
		//obj2.display(); 
	}
}
