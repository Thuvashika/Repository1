package com.learn.java.day8.array;

import java.util.Scanner;

public class OccurenceAndPosition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of elements: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Element to be found: ");
		int element=sc.nextInt();
		int count=0,pos[]=new int[n];
		for(int i=0;i<n;i++) {
			if(arr[i]==element) {
				pos[count]=i;
				count++;
			}
		}
		System.out.println("Occurences of "+element+" is : "+count);
		if(count!=0) {
			System.out.print("The positions are: ");
			for(int i=0;i<count;i++) {
				System.out.print(pos[i]+" ");
			}
		}
	}

}
