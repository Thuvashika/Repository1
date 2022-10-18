package com.learn.java.chapter10;

import java.util.Scanner;

public class CustomExceptions {
	String name;
	String nationality;
	int age;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		CustomExceptions obj=new CustomExceptions();
		obj.name=scanner.nextLine();
		obj.nationality=scanner.nextLine();
		try{
			obj.age=scanner.nextInt();
			obj.voterId();
		}catch(CheckedCustomException e){
			obj.nonIndian();
		}
		/**catch(UncheckedCustomException e) {
			obj.minor();
		}**/
		finally {
			System.out.println("you are not eligible");
		}
	}
	public void voterId() throws CheckedCustomException {
		checkNationality();
		checkAge();
	}
	public void checkAge() {
		if(age<18) {
			throw new UncheckedCustomException();
		}
	}
	public void checkNationality() throws CheckedCustomException {
		if(!nationality.equals("Indian")) {
			throw new CheckedCustomException();
		}
	}
	public void nonIndian() {
		System.out.println(name+" is not an Indian to vote");
	}
	public void minor() {
		System.out.println(name+" have to complete 18 years to vote");
	}
}
