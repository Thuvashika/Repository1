
package com.learn.java.day4;

import java.util.Scanner;

public class Conversions {
	/***a) cms to metres vice versa
	 b) metres to kms/miles vice versa
	 c) inches to feet vice versa
	 d) sqft to cent vice versa
	 e) grams to kgs vice versa
	 f) rupees to dollar vice versa (Let say 1 dollar = 76.75 Rupees)
	 g) fahrenheit to celsius vice versa**/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.cms to meters\n2.meters to cms\n3.meters to kms\n4.kms to meters\n5.sqft to cent\n6.cent to sqft\n7.inches to feet\n8.feet to inches\n"
				+ "9.grams to kgs\n10.kgs to grams\n11.rupees to dollars\n12.dollars to rupees\n13.fahrenheit to celsius\n14.celsius to fahrenheit");
		int choice =sc.nextInt();
		switch(choice) {
		case 1:
			double cm=sc.nextDouble();
			System.out.println(cm/100+" meters");
			break;
		case 2:
			double meter=sc.nextDouble();
			System.out.println(meter*100+" cms");
			break;
		case 3:
			double meters=sc.nextDouble();
			System.out.println(meters/1000+" kms");
			break;
		case 4:
			double kms=sc.nextDouble();
			System.out.println(kms*1000+" meters");
			break;
		case 5:
		    double sqft=sc.nextDouble();
			System.out.println(sqft/435.56+" cent");
			break;
		case 6:
			double cent=sc.nextDouble();
			System.out.println(cent*435.56+" sqft");
			break;
		case 7:
			double inches=sc.nextDouble();
			System.out.println(inches/12+" feet");
			break;
		case 8:
			double feet=sc.nextDouble();
			System.out.println(feet*12+" inches");
			break;
		case 9:
			double grams=sc.nextDouble();
			System.out.println(grams/1000+" kgs");
			break;
		case 10:
			double kgs=sc.nextDouble();
			System.out.println(kgs*1000+" grams");
			break;
		case 11:
			double rupees=sc.nextDouble();
			System.out.println(rupees/76.75+" dollars");
			break;
		case 12:
			double dollars=sc.nextDouble();
			System.out.println(dollars*76.75+" rupees");
			break;
		case 13:
			double fahrenheit=sc.nextDouble();
			System.out.println((fahrenheit-32)*(5/9)+" celsius");
			break;
		case 14:
			double celsius=sc.nextDouble();
			System.out.println((celsius*(9/5))+32+"fahrenheit");
			break;
		}
			
		
	}
}
