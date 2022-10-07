package com.learn.java.chapter7.finalkeyword;

final class FinalClass2 {
	public final int a;
	FinalClass2(int a){
		this.a = a;
		
	}
}

public class NewClass1{ //extends FinalClass2{  --final class cannot be overridden
	public static void main(String[] args) {
		FinalClass2 obj=new FinalClass2(10);
		System.out.println(obj.a);
		//obj.a=20;
	}
}