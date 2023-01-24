package com.learn.java.day8.string;

import java.util.Scanner;

public class PositionFind {
	static char changeCase(char ch) {
		
		return ch;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the word:");
		String str=sc.nextLine();
		System.out.print("Enter the letter to find:");
		char ch1=sc.next().charAt(0);
		char ch2=changeCase(ch1);
		int pos=0;
		int len=str.length();
		for(int i=0;i<len;i++) {
			if(ch1==str.charAt(i) || ch2==str.charAt(i)) {
				pos=i+1;
				break;
			}
		}
		if(pos==0) {
			System.out.print("The letter is not present in the String");
		}
		else{
			System.out.print("The letter is present in "+pos+" th position");
		}
	}


}
