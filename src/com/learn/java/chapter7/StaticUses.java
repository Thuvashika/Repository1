package com.learn.java.chapter7;
import com.learn.java.self.GreatGreat;
class Static{
	static int a=0;
	static {
		a=10;
	}
	Static(){
		System.out.println(a++);
	}
}
public class StaticUses {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			Static obj=new Static();
		}
	}
}
