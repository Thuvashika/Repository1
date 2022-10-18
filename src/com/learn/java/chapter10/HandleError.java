package com.learn.java.chapter10;
import java.util.Random;
public class HandleError {
	 public static void main(String args[]) {
		 int a=0, b=0, c=0;
         Random r = new Random();
         for(int i=1; i<10; i++) {
           try {
             b = r.nextInt();
             c = r.nextInt();
             a = 12345 / (b/c);
           } catch (Exception e) {
             System.out.println("Division by zero.");
             System.out.println("Exception: " + e);
             a = 0; // set a to zero and continue
           }
           System.out.println("a: " + a);
         }
	 }
}
