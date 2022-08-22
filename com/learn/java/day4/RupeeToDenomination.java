package com.learn.java.day4;

import java.util.Scanner;

public class RupeeToDenomination {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount:");
		int money=sc.nextInt();
		int total=money;
		int twoThousand=money/2000;
		money=money-(twoThousand*2000);
		int fiveHundred=money/500;
		money=money-(fiveHundred*500);
		int hundred=money/100;
		money=money-(hundred*100);
		int fifty=money/50;
		money=money-(fifty*50);
		int ten=money/10;
		money=money-(ten*10);
		System.out.println("2000X"+twoThousand+"="+2000*twoThousand);
		System.out.println(" 500X"+fiveHundred+"="+500*fiveHundred);
		System.out.println(" 100X"+hundred+"="+100*hundred);
		System.out.println("  50X"+fifty+"="+50*fifty);
		System.out.println("  10X"+ten+"="+10*ten);
		System.out.println("   1X"+money+"="+money);
		System.out.println("------------");
		System.out.println("Total  ="+total);
		
	}

}
