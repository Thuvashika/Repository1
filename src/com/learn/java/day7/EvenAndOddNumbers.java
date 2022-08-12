package com.learn.java.day7;

import java.util.Scanner;

public class EvenAndOddNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		float n=sc.nextInt();
		int a,sumev=0,sumodd=0;
		float n1=0,n2=0;
		System.out.print("Enter the numbers: ");
		for(int i=1;i<=n;i++) {
			a=sc.nextInt();
			if(a%2==0) {
				sumev+=a;
				n1++;
			}
			else {
				sumodd+=a;
				n2++;
			}
		}
		System.out.println("Sum of even numbers= "+sumev+" "+"Average= "+(sumev/n1));
		System.out.println("Sum of odd numbers= "+sumodd+" "+"Average= "+(sumodd/n2));

	}

}
