package com.learn.java.ch3;
import java.util.*;
public class GeoMetricalCalculations {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("For which shape you need to find area");
		String shape=sc.nextLine();
		String shapes=shape.toLowerCase();
		if(shapes.equals("triangle")) {
			System.out.println("Base");
			int base=sc.nextInt();
			System.out.println("length");
			int length=sc.nextInt();
			System.out.println("Area of the trianle= "+(0.5)*length*base+" square units");
		}
		else if(shapes.equals("circle")) {
			System.out.println("radius");
			int radius=sc.nextInt();
			System.out.println("Area of the circle= "+(2*3.14*radius*radius)+" square units");
		}
		else if(shapes.equals("rectangle")) {
			System.out.println("Breadth");
			int breadth=sc.nextInt();
			System.out.println("length");
			int length=sc.nextInt();
			System.out.println("Area of the rectangle= "+(length*breadth)+" square units");
		}
		else if(shapes.equals("square")) {
			System.out.println("length");
			int length=sc.nextInt();
			System.out.println("Area of the square= "+(length*length)+" square units");
		}
	}

}
