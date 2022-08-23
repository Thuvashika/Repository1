package com.learn.java.day7;

import java.util.Scanner;

public class StrongNumber {
	static int isStrongNumber(int number) {
		int sum=0;
		while(number!=0) {
			int i=number%10,fac=1;
			while(i!=1) {
				fac*=i;
				i--;
			}
			sum+=fac;
			number/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=isStrongNumber(n);
		if(n==sum) {
			System.out.println("It is a strong number");
		}
		else {
			System.out.println("It is not a strong number");
		}
	}
	

}
