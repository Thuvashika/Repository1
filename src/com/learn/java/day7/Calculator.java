package com.learn.java.day7;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=1;
		while(i==1) {
			System.out.print("Enter your choice :");
		    char choice=sc.next().charAt(0);
		    System.out.print("First number :");
		    int num1=sc.nextInt();
		    System.out.print("Second number :");
		    int num2=sc.nextInt();
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
		    char ch=sc.next().charAt(0);
		    if(ch=='n') {
		    	i=0;
		    }
		}
	}
	

}
