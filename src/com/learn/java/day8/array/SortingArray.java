package com.learn.java.day8.array;

import java.util.Scanner;

public class SortingArray {
	static int partition(int arr[],int str,int lst) {
		int i=str-1,x,y;
		int pivot=arr[lst];
		//selecting an element as pivot
		for(int j=str;j<=lst-1;j++) {
			if(arr[j]<pivot) {
				i++;
				x=arr[j];
				y=arr[i];
				arr[i]=x;
				arr[j]=y;
				/**Swapping all numbers lesser than pivot to its left
				and greater than pivot to its right**/

			}
		}
		x=arr[lst];
		y=arr[i+1];
		arr[i+1]=x;
		arr[lst]=y;
		//placing the pivot to its correct position.
		return i+1;
	}
	static int[] quickSort(int arr[],int str,int lst) {
		if(str<lst) {
			int pi=partition(arr,str,lst);
			//partition method is called.
			quickSort(arr, str,(pi-1));//recursion
			//sorting the elements present before the pi.
			quickSort(arr,(pi+1), lst);
			//sorting the elements present after the pi.
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of elements: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		arr=quickSort(arr,0,n-1);
		
		
		
		System.out.print("Ascending:");
		char asc=sc.next().charAt(0);
		System.out.print("Descending:");
		char desc=sc.next().charAt(0);
		if(asc=='y') {
			System.out.print("Array in ascending order: ");
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		if(desc=='y') {
			System.out.print("Array in descending order: ");
			for(int i=n-1;i>=0;i--) {
				System.out.print(arr[i]+" ");
			}
		}
		
		
	}
}
