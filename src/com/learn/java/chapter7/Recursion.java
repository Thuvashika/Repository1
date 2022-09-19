package com.learn.java.chapter7;

import java.util.Scanner;

public class Recursion {
	static String str="";
	static String DecimalToBinary(int number) {
		str+=(char)number%2;
		if(number!=0) {
			DecimalToBinary(number/2);
		}
		else{
			str=rev(str);
		}
		return str;
	}
	static String rev(String str) {
		String str1="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			str1+=str.charAt(i);
		}
		return str1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(DecimalToBinary(n));
	}

}
