package com.learn.java.day4;

import java.util.Scanner;

public class DenominationToRupees {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Total=0;
		System.out.println("Enter the denominations:");
		System.out.print("2000=");
		Total=Total+(2000*(sc.nextInt()));
		System.out.print(" 500=");
		Total=Total+(500*(sc.nextInt()));
		System.out.print(" 200=");
		Total=Total+(200*(sc.nextInt()));
		System.out.print(" 100=");
		Total=Total+(100*(sc.nextInt()));
		System.out.print("  50=");
		Total=Total+(50*(sc.nextInt()));
		System.out.println("The total amount for the above denominations : "+Total);
	}

}