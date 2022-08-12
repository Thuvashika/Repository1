package com.learn.java.day7;

import java.util.Scanner;

public class OddNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number ");
		int num1=sc.nextInt();
		System.out.print("Enter the second number ");
		int num2=sc.nextInt();
		if(num1%2==0) {
			num1++;
		}
		System.out.print("The odd numbers between the gvein range are: ");
		for(int i=num1;i<=num2;i+=2) {
			System.out.print(i+" ");
		}
	}

}
