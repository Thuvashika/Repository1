package com.learn.java.day6;

import java.util.Scanner;

public class NextGrade {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0;
		System.out.print("Maximum mark for each subjects :");
		int maxMark=sc.nextInt();
		System.out.println("Enter the subjects marks");
		for(int i=1;i<=5;i++) {
			int mark=sc.nextInt();
			if(mark<(maxMark/2)) {
				c=1;
			}
		}
		System.out.println((c==0)?"Eligible for next grade":"Not eligible for next grade");
	}

}
