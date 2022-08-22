package com.learn.java.day8.matrix;

import java.util.Scanner;

public class MatrixType {
	static void findType(int[][] mat,int n) {
		int digo=1,sca=1,iden=1;
		for(int i=0;i<n;i++) {
			int c=0;
			for(int j=0;j<n;j++) {
				if(i==j) {
					if(mat[i][j]==0) {
						c=1;
						break;
					}
					if(mat[i][j]!=1) {
						iden=0;
					}
					if(mat[0][0]!=mat[i][j]) {
						sca=0;
					}
				}
				else if(mat[i][j]!=0) {
					c=1;
					break;
				}
			}
			if(c==1) {
				digo=0;
				sca=0;
				iden=0;
				break;
			}
		}
		if(iden==1) {
			System.out.println("The given matrix is Identity matrix");
		}
		else if(sca==1) {
			System.out.println("The given matrix is Scalar matrix");
		}
		else if(digo==1) {
			System.out.println("The given matrix is Diagonal matrix");
		}
		
	}
	static void transpose(int[][] mat,int n,int m) {
		int newMat[][]=new int[m][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				newMat[j][i]=mat[i][j];
			}
		}
		System.out.println("Transpose of the matrix is:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(newMat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n :");
		int n=sc.nextInt();
		System.out.print("Enter m :");
		int m=sc.nextInt();
		int mat[][]=new int[n][m];
		System.out.print("Enter matrix elements: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		transpose(mat,n,m);
		if(m==n) {
			System.out.println("It is a square matrix");
			findType(mat,n);
		
		}
		else {
			System.out.println("It is not a square matrix");
		}
	}

}
