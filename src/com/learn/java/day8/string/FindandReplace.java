package com.learn.java.day8.string;

import java.util.Scanner;

public class FindandReplace {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char ch1=sc.next().charAt(0);
		char ch2=sc.next().charAt(0);
		String newStr="";
		for(char ch:str.toCharArray()) {
			if(ch==ch1) {
				newStr+=ch2;
			}
			else {
				newStr+=ch;
			}
		}
		System.out.println(newStr);
	}

}
