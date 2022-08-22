package com.learn.java.day6;

import java.util.Scanner;

public class EbBill {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float unit=sc.nextFloat();
		float sum=0;
		if(unit>1000) {
			sum+=(unit-1000)*7;
			unit=1000;
		}
		if(unit>=501) {
			sum+=(unit-500)*5;
			unit=500;
		}
		if(unit>=301) {
			sum+=(unit-300)*3;
			unit=300;
		}
		if(unit>=101) {
			sum+=(unit-100)*2.50;
		}
		System.out.println(sum);
	}

}
