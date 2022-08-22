package com.learn.java.day7;



public class Armstrong100To999 {
	public static void main(String[] args) {
		for(int a=100;a<=999;a++){
			int n=a,sum=0;
			while(n!=0) {
				sum+=Math.pow((n%10),3);
				n=n/10;
			}
		    if(sum==a) {
		    	System.out.print(a+" ");
		    }
		}
	}


}
