package com.learn.java.day6;

import java.util.Scanner;

public class CuttOff {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks");		
		System.out.print("Maths:");
		int Maths=sc.nextInt();
		System.out.print("Biology:");
		int Biology=sc.nextInt();
		System.out.print("Physics:");
		int Physics=sc.nextInt();
		System.out.print("Chemistry:");
		int Chemistry=sc.nextInt();
		System.out.print("BE Eligibility:");
		int BECutOff=sc.nextInt();
		System.out.print("MBBS Eligibility:");
		int MBBSCutOff=sc.nextInt();
		float BE=((Physics+Chemistry)/2)+Maths;
		float MBBS=((Physics+Chemistry)/2)+Biology;
		if(BE>=BECutOff && MBBS>=MBBSCutOff) {
			System.out.print("You are eligible for both BE and MBBS");
		}
		else if(BE>=BECutOff) {
			
			System.out.print("You are eligible for BE");
		}
		else if(MBBS>=MBBSCutOff) {
			System.out.print("You are eligible for MBBS");
		}
		else {
			System.out.print("You are not eligible for both");
		}
		
	}

}
