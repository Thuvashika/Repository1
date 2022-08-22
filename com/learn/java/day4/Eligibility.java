package com.learn.java.day4;

import java.util.Scanner;

public class Eligibility {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Name: ");
		String name=sc.next();
		System.out.print("Gender: ");
		char gender=sc.next().charAt(0);
		System.out.print("Age: ");
		byte age=sc.nextByte();
		String address=(gender=='M')?"Mr.":"Ms.";
		if(age>=18) {
			System.out.println(address+" "+name+" is eligible for vote");
		}
		else {
			System.out.println(address+" "+name+" is not eligible for vote");
		}
	}

}
