package com.learn.java.task1;
import java.util.Scanner;
public class Flames {
	public static void findRelation(short count) {
		String[] relations= {"Friend","Lover","Affection","Marriage","Enemies","Sister"};
		boolean flames[]=new boolean[6];
		short i=1;
		byte n=6,j=0;
		while(n>1) {
		//till 5 letters are stricken
			
			
			if(!flames[j]) {
				//if the letter not stricken before
				
				if(i==count) {
					i=1;
					//Again starting the count
					
					n--;
					
					flames[j]=true;
					//striking the letters
				}
				else{
					i++;
				}
			}
			j++;
			if(j==6) {
				j=0;
				//Again starting from 1st letter
			}
			
		}
		for(byte k=0;k<6;k++) {
			if(!flames[k]) {
				System.out.println(relations[k]);
				//prints the relation that is not stricken
				break;
			}
		}
		
	}
	public static byte[] findAscii(String str) {
		byte alpha[]=new byte[26];
		int len=str.length();
		for(byte i=0;i<len;i++) {
			
			int asc=str.charAt(i);
			if(asc>=97) {
				asc-=32;
				//changes ASCII value of lower case to upper case
				
			}
			asc-=65;
			//The range of upper case (65 to 90) is changed to (0 to 25)
			
			
			alpha[asc]++;
			
			
		}
		return alpha;
		
	}
	public static short deleteCommon(byte[] alpha1,byte[] alpha2) {
		short remain=0;
		for(byte i=0;i<26;i++) {
			remain+=(alpha1[i]<alpha2[i])?(alpha2[i]-alpha1[i]):(alpha1[i]-alpha2[i]);
			//Difference between count of each letter in 2 names are added
			
		}
		return remain;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		//creating scanner object
		
		String name1=sc.nextLine();
		//Getting 1st name
		
		
		String name2=sc.nextLine();
		//Getting 2nd name
		
		
		byte alpha1[]=findAscii(name1);
		//Array with count of each letters in Name1
		
		
		byte alpha2[]=findAscii(name2);
		//Array with count of each letters in Name2
		
		short count=deleteCommon(alpha1,alpha2);
		//delete common letters and return count of remaining leters
		
		findRelation(count);
		//prints relationship
	}

}
