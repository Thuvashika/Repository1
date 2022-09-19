package com.learn.java.self;

import java.util.ArrayList;

public class OutOfMemory {
	static int count=1;
	public static void main(String args[]) {
		System.out.println(count++);
		main(args);
	}

}
