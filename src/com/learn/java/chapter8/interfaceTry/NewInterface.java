package com.learn.java.chapter8.interfaceTry;

public interface NewInterface {
	default int mul(int a,int b) {
		return a*b;
	}

}
