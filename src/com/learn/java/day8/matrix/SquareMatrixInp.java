package com.learn.java.day8.matrix;
import java.util.*;
public class SquareMatrixInp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n :");
		int n=sc.nextInt();
		int mat[][]=new int[n][n];
		System.out.print("Enter matrix elements: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}
