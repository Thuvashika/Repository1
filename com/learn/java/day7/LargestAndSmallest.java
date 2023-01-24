package com.learn.java.day7;

import java.util.Scanner;

public class LargestAndSmallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		System.out.print("Enter the numbers: ");
		int a=sc.nextInt();
		int small=a,larg=a;
		for(int i=2;i<=n;i++) {
			a=sc.nextInt();
			if(a<small) {
				small=a;
			}
			if(a>larg) {
				larg=a;
			}
		}
		System.out.print("The largest number is: "+larg+"\n"+"The smallest number is: "+small);
	}

}
