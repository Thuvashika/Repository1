package com.learn.java.day8.array;

import java.util.Scanner;

public class RemoveDuplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of elements: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int i=0,newArr[]=new int[n];
		for(int j=0;j<n;j++) {
			int c=0;
			for(int k=0;k<=i;k++) {
				if(newArr[k]==arr[j]) {
					c=1;
					break;
				}
			}
			if(c==0) {
				
				newArr[i++]=arr[j];
			}
		}
		System.out.print("Array without duplicates: ");
		for(int j=0;j<i;j++) {
			System.out.print(newArr[j]+" ");
		}
	}

}
