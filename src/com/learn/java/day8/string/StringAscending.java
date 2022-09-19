package com.learn.java.day8.string;

import java.util.Scanner;

public class StringAscending {
	public static String ascendingOrderString(String str) {
		String str2="";
		short ascii[]=new short[65536];
		int len=str.length();
		for(int i=0;i<len;i++) {
			int asc=str.charAt(i);
			ascii[asc]++;
		}
		for(int i=0;i<65536;i++) {
			
			if(ascii[i]!=0) {
				char ch=(char)i;
				while(ascii[i]>0) {
					str2+=ch;
					ascii[i]--;
				}
			}
		}
		return str2;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(ascendingOrderString(str));
	}
	
}
