package com.learn.java.day8.array;

import java.util.Scanner;

public class ArrayConcatenate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of elements in 1st array: ");
		int n1=sc.nextInt();
		int[] arr1=new int[n1];
		System.out.print("Enter array elements of the 1st array : ");
		for(int i=0;i<n1;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.print("Number of elements in 2nd array: ");
		int n2=sc.nextInt();
		int[] arr2=new int[n2];
		System.out.print("Enter array elements of the 2nd array : ");
		for(int i=0;i<n2;i++) {
			arr2[i]=sc.nextInt();
		}
		int conArray[]=new int[n1+n2];
		for(int i=0;i<n1;i++) {
			conArray[i]=arr1[i];
		}
		for(int i=0;i<n2;i++) {
			conArray[n1+i]=arr2[i];
		}
		System.out.print("Concatenated array: ");
		for(int i=0;i<(n1+n2);i++) {
			System.out.print(conArray[i]+" ");
		}
	}

}
