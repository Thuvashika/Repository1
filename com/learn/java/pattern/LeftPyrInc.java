package com.learn.java.pattern;

import java.util.Scanner;

public class LeftPyrInc {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		System.out.print("Enter Increment Order: ");
		int inc=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int num=1;
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num+=inc;
			}
			System.out.println();
		}
	}

}
