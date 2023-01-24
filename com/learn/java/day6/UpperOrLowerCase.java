package com.learn.java.day6;

import java.util.Scanner;

public class UpperOrLowerCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		System.out.println(Character.isLowerCase(c)?"Lowercase":"Uppercase");
	}
	

}
