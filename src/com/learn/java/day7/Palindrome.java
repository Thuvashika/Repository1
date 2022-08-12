package com.learn.java.day7;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
	    String Word,newWord;
	    Scanner sc=new Scanner(System.in);
		System.out.print("Type the word: ");
		Word=sc.nextLine();
		int len=Word.length();
		newWord=Word.toLowerCase();
		String rev="";
		for(int i=len-1;i>=0;i--){
		    rev=rev+newWord.charAt(i);
		}
		if(newWord.equals(rev)){
		    System.out.println("The word is palindrome");
		}
		else{
		    System.out.println("The word is not a palindrome");
		}
		
	}

}
