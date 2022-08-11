package com.learn.java.day4;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Principle=");
		float principle=sc.nextFloat();
		System.out.print("Rate=");
		float rate=sc.nextFloat();
		System.out.print("No of days=");
		float Days=sc.nextFloat();
		float year=Days/365;
		float simpleInt=(principle*rate*year)/100;
		System.out.println("Simple Interest= "+simpleInt);
		System.out.println("Net Amount= "+(simpleInt+principle));
		System.out.println("Percentage of interest= "+(simpleInt/principle)*100+"%");
		
		
	}

}
