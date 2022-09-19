package com.learn.java.chapter7;

import java.util.Scanner;

public class FileShare {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		byte views=sc.nextByte();
		AccessLevel obj=new AccessLevel(); 
		obj.visible(views);
		
	}

}
