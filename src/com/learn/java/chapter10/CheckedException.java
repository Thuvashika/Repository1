package com.learn.java.chapter10;
import java.io.*;
public class CheckedException {
	public static void main(String[] args) {	
		try {
			methodWithThrows();
		} 
		catch (FileNotFoundException e) {
			System.out.println("file not found");
		}
		System.out.println("sleep");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("wake");
	}
	static void methodWithThrows() throws FileNotFoundException{
		PrintWriter pw=new PrintWriter("abc.txt");
		pw.write("Hello");
	}
}
