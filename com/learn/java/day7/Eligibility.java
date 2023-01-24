package com.learn.java.day7;

import java.util.Scanner;

public class Eligibility {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=1,male=0,female=0,maleEli=0,femEli=0;
		while(i==1) {
			System.out.print("Name: ");
			String name=sc.next();
			System.out.print("Gender: ");
		    char gender=sc.next().charAt(0); 
		    System.out.print("Age: ");
		    int age=sc.nextInt();
		    if(gender=='M') {
   		    	male++;
   		    	System.out.print("Mr. ");
		    }
		    else {
		    	female++;
		    	System.out.print("Ms. ");
		    }
		    if(age>=18) {
		    	System.out.println(name+" is eligible for vote");
		    	if(gender=='M') {
	   		    	maleEli++;
			    }
			    else {
			    	femEli++;
			    }
		    	
		    }
		    else {
			    System.out.println(name+" is not eligible for vote");
		    }
		    char ch=sc.next().charAt(0);
		    if(ch=='n') {
		    	i=0;
		    }
		}
		System.out.println("Overall visiters:");
		System.out.println("Male: "+male);
		System.out.println("Female: "+female);
		System.out.println("Eligible visiters:");
		System.out.println("Male: "+maleEli);
		System.out.println("Female: "+femEli);
		
		
	}

}
