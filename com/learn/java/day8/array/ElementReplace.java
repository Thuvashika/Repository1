package com.learn.java.day8.array;

import java.util.Scanner;

public class ElementReplace {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of elements: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Element to be replaced: ");
		int element1=sc.nextInt();
		System.out.print("Replaced with: ");
		int element2=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==element1) {
				arr[i]=element2;
			}
		}
		System.out.print("Replaced array: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
