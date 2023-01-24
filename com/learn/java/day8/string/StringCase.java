package com.learn.java.day8.string;
import java.util.*;
public class StringCase {

	static char upper(char ch) {
		int x=ch;
		if((ch!=' ') && x>=97) {
			ch-=32;
		}
		return ch;
	}
	static char lower(char ch) {
		int x=ch;
		if(ch!=' ' && x<97) {
			ch+=32;
		}
		return ch;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Title case\n 2.Upper case\n 3.Lower case\n 4.Sentence case\n");
		System.out.print("Enter the case no :");
		int choice=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the word:");
		String str=sc.nextLine();
		int len=str.length();
		String str1="";
		switch(choice) {
		case 1:
			str1+=upper(str.charAt(0));
			for(int i=1;i<len;i++) {
				if(str.charAt(i-1)==' ') {
					str1+=upper(str.charAt(i));
					
				}
				else {
					str1+=lower(str.charAt(i));
				}
			}
			break;
		case 2:
			for(int i=0;i<len;i++) {
				str1+=upper(str.charAt(i));			}
			break;
		case 3:
			for(int i=0;i<len;i++) {
				str1+=lower(str.charAt(i));
			}
			break;
		case 4:
			str1+=upper(str.charAt(0));
			for(int i=1;i<len;i++) {
				str1+=lower(str.charAt(i));
			}
			break;
		default:
			System.out.println("The number is not in the given list");
			
		}
		System.out.println(str1);
	}

}
