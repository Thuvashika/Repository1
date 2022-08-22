package com.learn.java.day4;
import java.util.*;

public class Biggest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.println("The biggest number is: "+((a>b)?a:b));
	}

}
