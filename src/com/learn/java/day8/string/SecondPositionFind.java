package com.learn.java.day8.string;

import java.util.Scanner;

public class SecondPositionFind {
	static char changeCase(char ch) {
		if(ch<97) {
			ch+=32;
	    }
		else{
			ch-=32;
		}
		return ch;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the word:");
		String str=sc.nextLine();
		System.out.print("Enter the letter to find:");
		char ch1=sc.next().charAt(0);
		char ch2=changeCase(ch1);
		int pos=0,c=0;
		int len=str.length();
		for(int i=0;i<len;i++) {
			if(ch1==str.charAt(i) || ch2==str.charAt(i)) {
				pos=i+1;
				c++;
				if(c==2) {
					break;
				}
			}
		}
		if(c==1) {
			System.out.print("The letter is present only once in the string");
		}
		else if(c==0) {
			System.out.print("The letter is not present in the String");
		}
		else{
			System.out.print("The letter is present in "+pos+" th position");
		}
	}

}
