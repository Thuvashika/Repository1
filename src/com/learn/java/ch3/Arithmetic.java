package com.learn.java.ch3;
import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Product of 2 numbers="+a*b*c);///product of 3 numbers
		c=(a>b)?a-b:b-a;
		System.out.println("Difference between 2 numbers="+c);
		c=a;
		a=b;
		b=c;///swapping using third variable(temp)
		System.out.println("swapping using third variable"+"\n"+"a="+a+"\n"+"b="+b);
		a=a+b;
		b=a-b;
		a=a-b;///swapping without third variable
		System.out.println("swapping without third variable"+"\n"+"a="+a+"\n"+"b="+b);
		System.out.println("Dividing 2 numbers,a/b="+a/b);///Division of 2 numbers
                //line added

	}

}

