package com.learn.java.ch3;

public class LimitCheck {
	public static void main(String[] args) {
		byte a=128;
		//Type mismatch: cannot convert from int to byte
		
		short b= -32769;
		//Type mismatch: cannot convert from int to short
		
		int c=2147483648;
		//The literal 2147483648 of type int is out of range 
		
		long d= -9223372036854775809l;
		//The literal 9223372036854775809l of type long is out of range 
	}

}
