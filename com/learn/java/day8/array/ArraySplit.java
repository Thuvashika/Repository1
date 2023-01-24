package com.learn.java.day8.array;

import java.util.Scanner;

public class ArraySplit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of elements: ");
		int n=sc.nextInt();
		int[] odd=new int[n],even=new int[n];
		int oddInd=0,evenInd=0;
		int[] arr=new int[n];
		System.out.print("Enter array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) {
				even[evenInd++]=arr[i];
			}
			else {
				odd[oddInd++]=arr[i];
			}
		}
		if(oddInd==0) {
			System.out.print("There is no odd number in the array");
		}
		else{
			System.out.print("The odd numbers array: ");
		    for(int i=0;i<oddInd;i++) {
		    	System.out.print(odd[i]+" ");
		    }
		}
		System.out.println();
		if(evenInd==0) {
			System.out.print("There is no even number in the array");
		}
		else{
			System.out.print("The even numbers array: ");
			for(int i=0;i<evenInd;i++) {
				System.out.print(even[i]+" ");
			}
		}
		System.out.println();
	}
	

}
