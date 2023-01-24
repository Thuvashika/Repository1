package com.learn.java.day7;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fac=n;
		while(n!=1) {
			fac*=n-1;
			
			n=n-1;
		}
		System.out.println(fac);
	}

}
