package com.learn.java.chapter7;


import java.util.*;

public class VarArgs {
	static void print(Object a,Object b) {
		System.out.println("object method");
	}
	static void print(int...arg) {
		System.out.println("Varargs method");
	}
	
	
	static void display(int[]...arr) {
		for(int[] obj:arr) {
			for(int i:obj) {
				System.out.println(i);
			}
		}
	}
	/**static void display(int[] arr) {
		for(int obj:arr) {
			System.out.println(obj);
		}
	}**/
	static void display(VarArgs...arr) {
		for(VarArgs obj:arr) {
			System.out.println(obj);
		}
	}
	static void display(List<VarArgs> arr) {
		for(VarArgs obj:arr) {
			System.out.println(obj);
		}
		System.out.println(arr);
	}
	static void display(byte...arr) {
		for(byte obj:arr) {
			System.out.println(obj);
		}
	}
	static void display(byte b, int...arr) {
		for(int obj:arr) {
			System.out.println(obj);
		}
	}
	static void display(int b, byte...arr) {
		for(byte obj:arr) {
			System.out.println(obj);
		}
	}
	static void display(long b) {
		System.out.println("long");
	}
	/**static void display(int...arr, byte b) {   varArgs must be the last parameter
		for(int obj:arr) {
			System.out.println(obj);
		}
	}**/
	static void display(long a,long b) {   //type promotion
		System.out.println("this");
	}
	public static void main(String[] args) {
		print(1,2);
		VarArgs obj1=new VarArgs();
		VarArgs obj2=new VarArgs();
		VarArgs obj3=new VarArgs();
		
		int[] arr= {1,2,3,4};
		display(arr); //--void display(int[]...arr) is called
		VarArgs[] objArr=new VarArgs[3];  //array of objects
		List<VarArgs> list=new ArrayList<VarArgs>();
		display(list);
		
		
		display(1); //void display(long b) is called
		//display(1); //if not void display(int b, byte...arr) is called 
		
		//displat(1); //if not void display(int[]...arr) is also not called
		
		ArrayList<VarArgs> list1=new ArrayList<VarArgs>();
		display(list1);
		display(obj1,obj2,obj3);
		byte a=10,b=20,c=30;
		display(a,b,c);
		display(10,b,c);
		//display(10,20,30); calls (int...arr) method
		//display(null);  calls array,varArgs,list...so ambiguity
		display(a,b); //1st checks no of arguments---calls display(long a,long b)
		
	}

}
