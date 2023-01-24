package com.learn.java.day8.matrix;

import java.util.Scanner;

public class MatrixEqual {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n :");
		int n=sc.nextInt();
		System.out.print("Enter m :");
		int m=sc.nextInt();
		int mat[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("number to be found :");
		int ele=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(mat[i][j]==ele) {
					System.out.print((i+1)+"th row\n"+(j+1)+"th column");
					break;
				
				}
			}
		}
	}

}
