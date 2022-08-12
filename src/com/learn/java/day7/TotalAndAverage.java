package com.learn.java.day7;

import java.util.Scanner;

public class TotalAndAverage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.print("Enter the second number ");
		int num2=sc.nextInt();
		int sum=0;
		float n=0;
		for(int i=num1;i<=num2;i++) {
			sum+=i;
			n++;
		}
		System.out.print("Sum= "+sum+"\n"+"Average= "+(sum/n));
	}

}
