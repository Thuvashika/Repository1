package com.learn.java.day8.string;

import java.util.Scanner;

public class Palindrome {
	static char getLower(char ch) {
		if(ch>64 && ch<91){
			ch+=32;
		}
		return ch;
	}
	public static void main(String[] args) {
	    String word;
	    Scanner sc=new Scanner(System.in);
		System.out.print("Type the word: ");
		word=sc.nextLine();
		int len=word.length(),c=0;
		for(int i=len-1,j=0;i>=0;i--,j++){
		   char ch1=word.charAt(i);
		   ch1=getLower(ch1);
		   char ch2=word.charAt(j);
		   ch2=getLower(ch2);
		   if(ch1!=ch2) {
			   c=1;
			   break;
		   }
		}
		if(c==1) {
			System.out.println("The word is not a palindrome");
		}
		else {
			System.out.println("The word is palindrome");
		}
		
	}

}
