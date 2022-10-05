package com.learn.java.chapter7;
class Test {
	String name;
	int age;
	int std;
	Test(){
		
	}
	Test(String name,int age,int std){
		this.name=name;
		this.age=age;
		this.std=std;
	}
	boolean isFriends(Test obj) {
		if(this.std==obj.std) {
			
	    	return true;
		}
		return false;
	}
	public void display() {
		isFriends(this);
		System.out.println("Yes");
	}
}
public class ObjectParameter extends Test {
	public static void main(String args[]) {
		Test obj1=new Test("Thuvashika",17,12);
		Test obj2=new Test("Koushika",14,9);
		Test obj3=new Test("Vaishnavi Parvathy",17,12);
		if(obj1.isFriends(obj3)) {
			System.out.println(obj1.name+" and "+obj3.name+" are friends ");
		}
		else {
			System.out.println(obj1.name+" and "+obj3.name+" are not friends ");
		}
		if(obj1.isFriends(obj2)) {
			System.out.println(obj1.name+" and "+obj2.name+" are friends ");
		}
		else {
			System.out.println(obj1.name+" and "+obj2.name+" are not friends ");
		}
		
	}

}
