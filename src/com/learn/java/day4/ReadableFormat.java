package com.learn.java.day4;

import java.util.Scanner;

public class ReadableFormat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Total=sc.nextInt();
		System.out.print((Total/100000)+" Kilometers ");
		Total=Total-((Total/100000)*100000);
		System.out.print((Total/100)+" meters ");
		Total=Total-((Total/100)*100);
		System.out.print((Total/30)+" Feets ");
		Total=Total-((Total/30)*30);
		System.out.print(Total+" centimeters ");
	}

}
