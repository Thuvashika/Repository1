package com.learn.java.ch3;

public class Casting {
	public static void main(String[] args) {
		int a=1;
		byte b=120;
		a=b;//byte to int
		System.out.println(a);
		int c=1;
		byte d=77;
		d=(byte)c;//int to byte(incompatible type casting)
		System.out.println(d);
		int x=10;
		float y=1;
		y=x;//int to float
		System.out.println(y);
		float x1=1;
		int y1=(int)x1;//float to int
		System.out.println(y1);
		int a1= 20;
		long b1=20000000000l;
		b1=a1;//int to long
		System.out.println(b1);
		a1=(int)b1;//long to int
		System.out.println(a1);
		
	}

}
