package com.learn.java.task1;
import java.util.*;
public class Flames {
	public static void findRelation(int count) {
		String[] relations= {"Friend","Lover","Affection","Marriage","Enemies","Sister"};
		int flames[]=new int[6];
		int i=1,n=6,j=0;
		while(n>1) {
			if(flames[j]!=-1) {
				if(i==count) {
					i=1;
					n--;
					flames[j]=-1;
				}
				else{
					i++;
				}
			}
			j++;
			if(j==6) {
				j=0;
			}
			
		}
		for(int k=0;k<6;k++) {
			if(flames[k]==0) {
				System.out.println(relations[k]);
			}
		}
		
	}
	public static int[] findAscii(String str) {
		int alpha[]=new int[26];
		int len=str.length();
		for(int i=0;i<len;i++) {
			
			int asc=str.charAt(i);
			if(asc>=97) {
				asc-=32;
			}
			asc-=65;
			alpha[asc]++;
			
		}
		return alpha;
		
	}
	public static int deleteCommon(int[] alpha1,int[] alpha2) {
		int remain=0;
		for(int i=0;i<26;i++) {
			remain+=(alpha1[i]<alpha2[i])?(alpha2[i]-alpha1[i]):(alpha1[i]-alpha2[i]);
		}
		System.out.println(remain);
		return remain;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		int alpha1[]=findAscii(str1);
		int alpha2[]=findAscii(str2);
		int count=deleteCommon(alpha1,alpha2);
		findRelation(count);
	}

}
