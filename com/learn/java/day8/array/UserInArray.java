package com.learn.java.day8.array;
import java.util.*;
public class UserInArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of elements: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Reverse printing: ");
		for(int i=n-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
			//printing array in the reversed order
		}
		System.out.println();
		int t;
		for(int i=0;i<=n/2;i++) {
			t=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=t;
		}//reversing the array elements
		System.out.print("Reversed array: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			//printing array in the reversed order
		}
		System.out.println();
		
		
		int oddSum=0,evenSum=0;
		for(int i=0;i<n;i++) {
			if(i%2!=0) {
				oddSum+=arr[i];
			}
			else {
				evenSum+=arr[i];
			}
		}
		System.out.println("Sum of numbers in the odd position= "+oddSum);
		System.out.println("Sum of numbers in the even position= "+evenSum);

	}

}
