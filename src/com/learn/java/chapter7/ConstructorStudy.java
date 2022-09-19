package com.learn.java.chapter7;
class Student{
	static String name;
	static int rollNo;
	static int age;
	String fatherName;
	Student(){
	}
	Student(String name,int rollNo,int age,String fatherName){
		this.name=name;
		this.rollNo=rollNo;
		this.age=age;
		this.fatherName=fatherName;
	}
	void printDetails(Student obj) {
		System.out.println("Name: "+obj.name);
		System.out.println("Roll no: "+obj.rollNo);
		System.out.println("Age: "+obj.age);
		System.out.println("Father's Name: "+obj.fatherName);
		
	}
}
public class ConstructorStudy {
	public static void main(String[] args) {
		Student obj=new Student("Koushika",33,17,"Palaniappan");
		obj.printDetails(obj);
		Student obj1=new Student();
		System.out.println(obj1.name);
		obj1.printDetails(obj1);
		obj.printDetails(obj1);
	}
}
