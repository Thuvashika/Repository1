package com.learn.java.day4;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("The number is: "+((a%2==0)?"even":"odd"));
	}

}
