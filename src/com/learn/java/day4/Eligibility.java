package com.learn.java.day4;

import java.util.Scanner;

public class Eligibility {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Name=sc.nextLine();
		char Gender=sc.next().charAt(0); 
		int Age=sc.nextInt();
		String Address=(Gender=='M')?"Mr.":"Ms.";
		if(Age>=18) {
			System.out.println(Address+" "+Name+" is eligible for vote");
		}
		else {
			System.out.println(Address+" "+Name+" is not eligible for vote");
		}
	}

}
