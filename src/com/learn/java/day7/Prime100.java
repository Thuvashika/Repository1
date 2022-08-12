package com.learn.java.day7;

public class Prime100 {
	public static void main(String[] args) {
		System.out.print("The prime numbers between 1 to 100 are: ");
		for(int i=2;i<=100;i++) {
			int c=0;
			for(int j=2;j<=(i/2);j++) {
				if(i%j==0) {
					c=1;
					break;
				}
			}
			if(c==0){
				System.out.print(i+" ");
			}
		}
	}

}
