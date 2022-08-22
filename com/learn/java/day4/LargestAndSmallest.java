package com.learn.java.day4;

import java.util.Scanner;

public class LargestAndSmallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		if(a>b && a>c) {
			System.out.println("Largestnumber is "+a);
			System.out.println("Smallest number is "+((b>c)?c:b));
		}
		else if(b>a && b>c) {
			System.out.println("Largestnumber is "+b);
			System.out.println("Smallest number is "+((a>c)?c:a));
		}
		else {
			System.out.println("Largestnumber is "+c);
			System.out.println("Smallest number is "+((b>a)?a:b));
		}
	}

}
