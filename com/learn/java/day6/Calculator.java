package com.learn.java.day6;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your choice :");
		char choice=sc.next().charAt(0);
		System.out.print("First number :");
		double num1=sc.nextDouble();
		System.out.print("Second number :");
		double num2=sc.nextDouble();
		switch(choice){
		case '+':
			System.out.println("Addition of the numbers :"+(num1+num2));
			break;
		case '-':
			System.out.println("Subtraction of the numbers :"+(num1-num2));
			break;
		case '*':
			System.out.println("Multiplication of the numbers :"+(num1*num2));
			break;
		case '/':
			System.out.println("Division of the numbers :"+(num1/num2));
			break;
		case '%':
			System.out.println("Modulo division of the numbers :"+(num1%num2));
			break;
		}
	}
	

}
