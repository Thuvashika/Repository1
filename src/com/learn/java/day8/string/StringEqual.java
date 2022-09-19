package com.learn.java.day8.string;

import java.util.Scanner;

public class StringEqual {
	static char getLower(char ch) {
		if(ch>64 && ch<91){
			ch+=32;
		}
		return ch;
	}
	public static void main(String[] args) {
	    String word1,word2;
	    Scanner sc=new Scanner(System.in);
		System.out.print("Type the word1: ");
		word1=sc.nextLine();
		System.out.print("Type the word2: ");
		word2=sc.nextLine();
		int len1=word1.length(),len2=word2.length();
		if(len1!=len2) {
			System.out.println("The strings are not equal");
		}
		else{
			int c=0;
			for(int i=0;i<len1;i++) {
				char ch1=word1.charAt(i);
				ch1=getLower(ch1);
				char ch2=word2.charAt(i);
				ch2=getLower(ch2);
				if(ch1!=ch2) {
					   c=1;
					   break;
				   }
			}
			if(c==1) {
				System.out.println("The strings are not equal");
			}
		    else {
		    	System.out.println("The strings are equal");
		    	}
			}
		}
}

