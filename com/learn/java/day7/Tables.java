package com.learn.java.day7;

import java.util.Scanner;

public class Tables {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=16;i++) {
			System.out.println(i+"X"+n+"="+(i*n));
		}
	}

}
