package com.learn.java.day8.string;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the word:");
		String str=sc.nextLine();
		String rev=" ";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		System.out.print("The reversed word is: "+rev);
	}

}
