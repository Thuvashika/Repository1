package com.learn.java.pattern;

import java.util.Scanner;

public class DiamondPyr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		System.out.print("Enter Increment Order: ");
		int inc=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=0;j--) {
				if(j<i)
				System.out.print(((j*inc)+1)+"\t");
				else
				System.out.print("\t");
			}
			
			for(int j=0;j<i;j++) {
				System.out.print(((j*inc)+1)+"\t");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=n-1;j>=0;j--) {
				if(j<i)
				System.out.print(((j*inc)+1)+"\t");
				else
				System.out.print("\t");
			}
			
			for(int j=0;j<i;j++) {
				System.out.print(((j*inc)+1)+"\t");
			}
			System.out.println();
		}
	}

}
