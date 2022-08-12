package com.learn.java.day7;

import java.util.Scanner;

public class EvenAndOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.print("Enter the second number ");
		int num2=sc.nextInt();
		int sumev=0;
		int sumodd=0;
		float n1=0;
		float n2=0;
		for(int i=num1;i<=num2;i++) {
			if(i%2==0) {
				sumev+=i;
				n1++;
			}
			else {
				sumodd+=i;
				n2++;
			}
		}
		System.out.println("Sum of even numbers= "+sumev+" "+"Average= "+(sumev/n1));
		System.out.println("Sum of odd numbers= "+sumodd+" "+"Average= "+(sumodd/n2));

	}


}
