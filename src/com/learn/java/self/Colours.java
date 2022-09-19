package com.learn.java.self;

import java.util.Scanner;

public class Colours {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println((n<11)?((n>4)?"Red":((n>-1)?"Green":"invalid")):((n<16)?"Orange":((n<21)?"Yellow":"invalid")));
	}

}


/**
 * System.out.println((n<11)?((n>4)?"Red":((n>-1)?"Green":"invalid")):((n<16)?"Orange":((n<21)?"Yellow":"invalid")));
 * 0-4--> NO of checks:3
 * 5-10-->No of checks:2
 * 11-15-->No of checks:2
 * 16-20--> No of checks:3
 * <0 && >20 --> No of checks:3
 */
 
/**
 * System.out.println(((20/n)<1) ? "invalid" :((n<5)?"Green":((n<11)?"Red":((n<16)?"Orange":"Yellow"))));
 * 0-->error
 * 1-4--> NO of checks:2
 * 5-10-->No of checks:3
 * 11-15-->No of checks:4
 * 16-20--> No of checks:4
 * <0 && >20 --> No of checks:1
**/

/**
 * System.out.println((n<0) ? "invalid" :((n<5)?"Green":((n<11)?"Red":((n<16)?"Orange":(n<20)?"yellow":"invalid"))));
 * 
 * 0-4--> NO of checks:2
 * 5-10-->No of checks:3
 * 11-15-->No of checks:4
 * 16-20--> No of checks:5
 * <0-->No of checks:1
 * >20 --> No of checks:5
 * 
 */


/**
 * System.out.println((n>=0 && n<=20) ? ((n<11)?((n<5)?"Green":"Red"):((n<16)?"Orange":"Yellow")):"invalid");
 *
 * 0-4--> NO of checks:4
 * 5-10-->No of checks:4
 * 11-15-->No of checks:4
 * 16-20--> No of checks:4
 * <0 && >20 --> No of checks:2
 * 
 */


/**
 * System.out.println((n<0 || n>20)?"invalid":((n<5)?"Green":((n<11)?"Red":((n<16)?"Orange":"yellow"))))
 *
 * 0-4--> NO of checks:3
 * 5-10-->No of checks:4
 * 11-15-->No of checks:5
 * 16-20--> No of checks:5
 * <0 && >20 --> No of checks:1
 * 
 */









