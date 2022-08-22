package com.learn.java.day7;

import java.util.Scanner;

public class TotalAndAverageOfNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		double sum=0;
		System.out.print("Enter the numbers: ");
		for(int i=1;i<=n;i++) {
			sum+=sc.nextDouble();
		}
		System.out.print("sum of the numbers is: "+sum+"\n"+"Average= "+(sum/n));
	}

}
