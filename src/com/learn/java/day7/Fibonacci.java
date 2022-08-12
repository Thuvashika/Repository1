package com.learn.java.day7;
import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f1=0,f2=1,i=2,t;
		System.out.print(f1+" ");
		if(n!=1) {
			System.out.print(f2+" ");
		}
		while(i<=n) {
			t=f1;
			f1=f2;
			f2=t+f1;
			System.out.print(f2+" ");
			i+=1;
		}
	}

}
