package com.learn.java.pattern;

import java.util.Scanner;

public class RightPyrNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n;j++) {
				if(j>=(n-i))
				System.out.print(j+" ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}
	}

}
