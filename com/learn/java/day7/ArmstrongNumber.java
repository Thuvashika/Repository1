package com.learn.java.day7;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		int a=n,sum=0;
		while(n!=0) {
			sum+=Math.pow((n%10),3);
			n=n/10;
		}
		if(sum==a) {
			System.out.println("It is an armstrong number");
		}
		else {
			System.out.println("It is not an armstrong number");
		}
	}

}
