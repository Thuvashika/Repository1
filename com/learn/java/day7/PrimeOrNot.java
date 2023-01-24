package com.learn.java.day7;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1) {
			System.out.println("It is not a prime number");
		}
		else{
			int c=0;
			for(int i=2;i<(n/2);i++) {
				if(n%i==0) {
					c=1;
					break;
				}
			}
		    System.out.println((c==0)?"It is a prime number":"It is not a prime number");
		}
	}

}
