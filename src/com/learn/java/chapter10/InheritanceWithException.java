package com.learn.java.chapter10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

interface ExceptionTry{
	public void instanceMethod() throws Exception ;
	public void Unchecked();
}

class Parent implements ExceptionTry{
	public void instanceMethod() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Parent method");
	}
	public static void staticMethod() throws IOException {
		PrintWriter pw=new PrintWriter("abc.txt");
		pw.write("Hello");
		System.out.println("parent method");
	}
	@Override
	public void Unchecked() throws ArithmeticException{
		//can throw Unchecked exceptions---even though overriding/implementing the method without exception
	}
}
class Child extends Parent{
	public void instanceMethod() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Child method");
	}
	public static void staticMethod() throws FileNotFoundException{  //throws child class
		PrintWriter pw=new PrintWriter("abc.txt");
		pw.write("Hello");
		System.out.println("child method");
	}
	public void Unchecked() throws ArrayIndexOutOfBoundsException{
		
	}
}
public class InheritanceWithException {

	public static void main(String[] args) throws  IOException, InterruptedException {
		Parent obj=new Child();
		obj.instanceMethod();
		obj.staticMethod();
	}

}
