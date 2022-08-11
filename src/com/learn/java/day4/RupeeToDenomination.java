package com.learn.java.day4;

import java.util.Scanner;

public class RupeeToDenomination {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount:");
		int money=sc.nextInt();
		int total=money;
		int Twothousand=money/2000;
		money=money-(Twothousand*2000);
		int Fivehundred=money/500;
		money=money-(Fivehundred*500);
		int Hundred=money/100;
		money=money-(Hundred*100);
		int Fifty=money/50;
		money=money-(Fifty*50);
		int Ten=money/10;
		money=money-(Ten*10);
		System.out.println("2000X"+Twothousand+"="+2000*Twothousand);
		System.out.println(" 500X"+Fivehundred+"="+500*Fivehundred);
		System.out.println(" 100X"+Hundred+"="+100*Hundred);
		System.out.println("  50X"+Fifty+"="+50*Fifty);
		System.out.println("  10X"+Ten+"="+10*Ten);
		System.out.println("   1X"+money+"="+money);
		System.out.println("------------");
		System.out.println("Total  ="+total);
		
	}

}
