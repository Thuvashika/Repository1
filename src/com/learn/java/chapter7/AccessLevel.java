package com.learn.java.chapter7;

public class AccessLevel {
	void visible(byte x) {
		System.out.println("Visible for the people in the city");
	}
	void visible(short x) {
		System.out.println("Visible for all the people in the state");
	}
	void visible(int x) {
		System.out.println("Visible for all the people in the country");
	}
	void visible(long x) {
		System.out.println("Visible for all the people");
	}
}
