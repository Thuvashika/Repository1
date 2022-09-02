package com.learn.java.task1;
import java.util.Scanner;
public class Flames {
	public static boolean isValid(String str) {
		int len=str.length();
		for(int i=0;i<len;i++) {
			int ch=str.charAt(i);
			
			//checks whether the character is number or special characters
			if(((ch<65 && ch!=32) || ch>122) || (ch>90 && ch<97)) {
				return false;
			}
		}
		return true;
	}
	public static String findRelation(short count) {
		String[] relations= {"Friend","Lover","Affection","Marriage","Enemies","Sister"};
		boolean flames[]=new boolean[6];
		short i=1;
		byte n=6,j=0;
		
		//till 5 letters are stricken
		while(n>1) {
			
			//if the letter not stricken before
			if(!flames[j]) {
				
				if(i==count) {
					
					//Again starting the count
					i=1;
					
					n--;
					
					//striking the letters
					flames[j]=true;
				}
				else{
					i++;
					
				}
			}
			j++;
			if(j==6) {
				
				//Again starting from 1st letter
				j=0;
			}
			
		}
		String s=null;
		for(byte k=0;k<6;k++) {
			if(!flames[k]) {
				
				//the relation that is not stricken is stored in s
				s=relations[k];
				break;
			}
		}
		
		//returns the relationship
		return s;
		
	}
	public static byte[] findAscii(String str) {
		byte alpha[]=new byte[26];
		int len=str.length();
		for(byte i=0;i<len;i++) {
			
			int asc=str.charAt(i);
			if(asc!=' ' ) {
				
				//changes ASCII value of lower case to upper case
				if(asc>=97) {
					asc-=32;
				}
				
				//The range of upper case (65 to 90) is changed to (0 to 25)
				asc-=65;	
				alpha[asc]++;
			}	
		}
		return alpha;
		
	}
	public static short deleteCommon(byte[] alpha1,byte[] alpha2) {
		short remain=0;
		for(byte i=0;i<26;i++) {
			//Difference between count of each letter in 2 names are added
			remain+=(alpha1[i]<alpha2[i])?(alpha2[i]-alpha1[i]):(alpha1[i]-alpha2[i]);
			
		}
		return remain;
	}
	public static void main(String args[]) {
		
		//creating scanner object
		Scanner sc=new Scanner(System.in);
		
		//Getting 1st name
		System.out.print("Enter Name1:");
		String name1=sc.nextLine();
		
		
		//Getting 2nd name
		System.out.print("Enter Name2:");
		String name2=sc.nextLine();
		
		long start1 = System.nanoTime();
		
		//checks whether there are 2 names
		if(name1.equals("") || name2.equals("")) {
			System.out.println("Two names required to calculate flames");
		}
		
		//checks the given names are valid without numbers and special characters
		else if(!isValid(name1) || !isValid(name2)) {
			System.out.println("The given name is not valid. Name should contain only alphabets");
		}
		
		//checks the length of the names are grater than 1
		else if(name1.length()==1 || name2.length()==1 ) {
			System.out.println("The given name is not valid. Name should contain more than 1 character");
		}
		
		//checks the given names are equal
		else if(name1.equals(name2)) {
			System.out.println("Not able to calculate Flames beteween same names");
		}
		
		else{
			//Array with count of each letters in Name1
			byte alpha1[]=findAscii(name1);
			
			//Array with count of each letters in Name2
			byte alpha2[]=findAscii(name2);
		
		    //delete common letters and return count of remaining letters
		    short count=deleteCommon(alpha1,alpha2);
		    
		    if(count==0) {
		    	System.out.println("Not able to calculate Flames");
		    }
		    else{
		    	
		    	//prints relationship
		    	System.out.println("RelationShip: "+findRelation(count));
		    }
		}
		
		long end1 = System.nanoTime();
		
		//Time taken by the program in nanoseconds 
		System.out.println("Elapsed Time in nano seconds: "+ (end1-start1));
		
	}

}
