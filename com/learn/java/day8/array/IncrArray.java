package com.learn.java.day8.array;

import java.util.Scanner;

public class IncrArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Size of your array :");
		int n=sc.nextInt(),i=1;
		int[] arr=new int[n];
		System.out.println("Enter your elements");
		System.out.print("array [0] ->"); 
		arr[0]=sc.nextInt();
		int max=arr[0];
		while(i<n){
			System.out.print("array ["+i+"] ->"); 
			int ele=sc.nextInt();
			if(max>=ele) {
				System.out.println("Number must be greater than "+max);
			}
			else{
				max=ele;
				arr[i]=ele;
				i++;
			}
		}
	}

}
