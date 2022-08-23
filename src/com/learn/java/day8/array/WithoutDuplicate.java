package com.learn.java.day8.array;

import java.util.Scanner;

public class WithoutDuplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Size of your array :");
		int n=sc.nextInt(),i=0;
		int[] arr=new int[n];
		int ind=0,newArr[]=new int[n];
		System.out.println("Enter your elements");
		while(i<n){
			System.out.print("array ["+i+"] ->"); 
			int ele=sc.nextInt();
			int c=0;
			for(int k=0;k<=ind;k++) {
				if(newArr[k]==ele) {
					c=1;
					System.out.println("Duplicate not allowed. Please enter another number");
					break;
				}
			}
			if(c==0) {
				newArr[ind++]=ele;
				arr[i]=ele;
				i++;
			}
		}
	}

}
