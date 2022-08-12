package com.learn.java.day6;

import java.util.Scanner;

public class NextGrade {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0;
		for(int i=1;i<=5;i++) {
			int mark=sc.nextInt();
			if(mark<50) {
				c=1;
			}
		}
		System.out.println((c==0)?"Eligible for next grade":"Not eligible for next grade");
	}

}
