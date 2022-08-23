package com.learn.java.day8.matrix;

import java.util.Scanner;

public class MatrixOperations {
	static void display(int[][] mat,int n,int m) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void addition(int[][] mat1,int[][]mat2,int n,int m) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				mat1[i][j]+=mat2[i][j];
			}
		}
		System.out.println("Matrix addition:");
		display(mat1,n,m);
	}
	
	static void isEqual(int[][] mat1,int[][]mat2,int n,int m) {
		int c=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(mat1[i][j]!=mat2[i][j]) {
					c=1;
					break;
				}
			}
		}
		if(c==0) {
			System.out.println("Given two matrices are equal");
		}
		else {
			System.out.println("Given two matrices are not equal");
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n1 :");
		int n1=sc.nextInt();
		System.out.print("Enter m1 :");
		int m1=sc.nextInt();
		System.out.print("Enter 1st matrix elements: ");
		int mat1[][]=new int[n1][m1];
		for(int i=0;i<n1;i++) {
			for(int j=0;j<m1;j++) {
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix1:");
		for(int i=0;i<n1;i++) {
			for(int j=0;j<m1;j++) {
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.print("Enter n2 :");
		int n2=sc.nextInt();
		System.out.print("Enter m2 :");
		int m2=sc.nextInt();
		System.out.print("Enter 2nd matrix elements: ");
		int mat2[][]=new int[n2][m2];
		for(int i=0;i<n2;i++) {
			for(int j=0;j<m2;j++) {
				mat2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix2:");
		for(int i=0;i<n2;i++) {
			for(int j=0;j<m2;j++) {
				System.out.print(mat2[i][j]+" ");
			}
			System.out.println();
		}
		if(n1!=n2 || m1!=m2) {
			System.out.println("Given two matrices are not equal");
			System.out.println("We can't able to add the 2 matrices");
		}
		else{
			isEqual(mat1,mat2,n1,m1);
			addition(mat1,mat2,n1,m1);
		}
		
	}

}
