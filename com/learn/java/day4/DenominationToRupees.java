package com.learn.java.day4;

import java.util.Scanner;

public class DenominationToRupees {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int total=0;
		System.out.println("Enter the denominations:");
		System.out.print("2000=");
		total=total+(2000*(sc.nextInt()));
		System.out.print(" 500=");
		total=total+(500*(sc.nextInt()));
		System.out.print(" 200=");
		total=total+(200*(sc.nextInt()));
		System.out.print(" 100=");
		total=total+(100*(sc.nextInt()));
		System.out.print("  50=");
		total=total+(50*(sc.nextInt()));
		System.out.println("The total amount for the above denominations : "+total);
	}

}