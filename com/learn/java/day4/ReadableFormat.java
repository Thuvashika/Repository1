package com.learn.java.day4;

import java.util.Scanner;

public class ReadableFormat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int total=sc.nextInt();
		System.out.print((total/100000)+" Kilometers ");
		total=total-((total/100000)*100000);
		System.out.print((total/100)+" meters ");
		total=total-((total/100)*100);
		System.out.print((total/30)+" Feets ");
		total=total-((total/30)*30);
		System.out.print(total+" centimeters ");
	}

}
