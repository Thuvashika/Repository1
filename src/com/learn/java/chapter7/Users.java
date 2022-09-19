package com.learn.java.chapter7;

import java.util.Scanner;

public class Users {
	static int id=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("No of users:");
		int no=sc.nextInt();
		while(no--!=0) {
			System.out.println("1.Temperory user 2.Have Account");
		    byte n=sc.nextByte();
		    switch(n){
		    case 1: 
		    	System.out.println("Your temperory id is:"+ ++id);
		    	Page obj=new Page();
		    	obj.aboutPage(id);
		    	break;
		    case 2:
		    	System.out.println("Enter Username");
		    	sc.nextLine();
		    	String userName=sc.nextLine();
		    	Page obj1=new Page();
		    	obj1.aboutPage(userName);
		    }
		}
	}
}
