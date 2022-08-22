package com.learn.java.day8.matrix;

import java.util.Scanner;

public class MatrixMultiplication {
	static void multiplication(int[][] mat1,int n1,int m1,int[][]mat2,int n2,int m2) {
		int newMat[][]=new int[n1][m2];
		for(int i=0;i<n1;i++) {
			for(int k=0;k<m2;k++) {
				int sum=0;
				for(int j=0;j<m1;j++) {
					sum+=mat1[i][j]*mat2[j][k];
				}
				newMat[i][k]=sum;
			}
		}
		System.out.println("Result of matrix multiplication :");
		for(int i=0;i<n1;i++) {
			for(int j=0;j<m2;j++) {
				System.out.print(newMat[i][j]+" ");
			}
			System.out.println();
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
		System.out.println();
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
		System.out.println();
		if(m1!=n2) {
			System.out.println("We can't able to multiply 2 matrices");
		}
		else{
			multiplication(mat1,n1,m1,mat2,n2,m2);
		}
	}

}
