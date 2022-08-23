package com.learn.java.day6;

import java.util.Scanner;

public class CuttOff {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks");		
		System.out.print("Maths:");
		int maths=sc.nextInt();
		System.out.print("Biology:");
		int biology=sc.nextInt();
		System.out.print("Physics:");
		int physics=sc.nextInt();
		System.out.print("Chemistry:");
		int chemistry=sc.nextInt();
		System.out.print("BE Eligibility:");
		int beCutOff=sc.nextInt();
		System.out.print("MBBS Eligibility:");
		int mbbsCutOff=sc.nextInt();
		float be=((physics+chemistry)/2)+maths;
		float mbbs=((physics+chemistry)/2)+biology;
		if(be>=beCutOff && mbbs>=mbbsCutOff) {
			System.out.print("You are eligible for both BE and MBBS");
		}
		else if(be>=beCutOff) {
			
			System.out.print("You are eligible for BE");
		}
		else if(mbbs>=mbbsCutOff) {
			System.out.print("You are eligible for MBBS");
		}
		else {
			System.out.print("You are not eligible for both");
		}
		
	}

}
