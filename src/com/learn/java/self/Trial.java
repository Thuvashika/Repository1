package com.learn.java.self;
class GreatGrand{
	static int a=10;
	static {
		System.out.println("Out");
		{
			System.out.println("in");
		}
		System.out.println("Out");
	}
	GreatGrand(){
		System.out.println("Out");
		{
			System.out.println("in");
		}
		System.out.println("Out");
	}
	void inheritedWealth() {
		System.out.println("Wealth: Gold chain");
	}
	private void name() {
		System.out.println("Santhanu");
	}
}
class GrandParent extends GreatGrand{
	
	int a=10;
	{
		System.out.println("True");
	}
	void property(Son obj) {
		System.out.println("Wealth: Farming land");
		System.out.println(this);
		System.out.println(obj);
		obj.age();
		this.age(); //always calls the method present in the class if not overridden by the object called the method
		//GrandParent obj=new GrandParent();
		//obj.age(); 
		this.name(); //always calls its method because private method(not overridden)

	}
	
	private void name() {
		System.out.println("Visitra");
	}
	void age(byte...var) {
		System.out.println("Age: 70");
		//property();
		//for GrandParent.property calls age and age calls property again..so out of memory error 
	}
	static public void age(int...var) {
		System.out.println("Age:");
	}
}
class Son extends GrandParent{
	int a=20; //not overriding...creating new variable
	void property() {
		super.property(this); //like up casting
		//age();//always calls this.age()...so calls GrandChild.age();
		//byte a=10;
		//age(a);  selects the specific method(parent methods are also the methods of this class)
		this.name(); //for child class object---overridden name method is executed
		
	}
	//not overridden overloaded
	void age(byte...var) {
		System.out.println("Age: 48");
	}
	
	//overridden
	void name() {
		System.out.println("Pandu");
	}
	
}
final class GrandChild extends Son{  
	protected void property() {
		System.out.println("Wealth: Bunglow");
		super.property(); //calls immediate parent class with property method
		super.inheritedWealth();
		//this.age();
		//age();
	}
	public void age(byte...var) {
		System.out.println("Age: 25");
		
		
	}
	//can increase but not decrease the accessibility of overridden method
	public void name() {
		System.out.println("Arjun");
	}
	
}
// class GreatGrandChild extends GrandChild   final classes-cannot be extended


public class Trial {

	public static void main(String[] args) {
		GrandParent obj=new GrandParent();
		Son obj1=new Son();
		obj1.property();
		obj1.age();
		GrandChild obj2=new GrandChild();
		obj2.property();
		obj2.age();
		//obj2.age((byte)22);   private method
		
		obj.age();
		//obj.property();
		obj1.property();
		System.out.println("a= "+obj1.a); //calls son's a
		obj2.property();
		System.out.println("a= "+obj2.a); //calls son's a**/
	}

}


//static block gets executed first when class is loaded in memory
/**
* static block of parent class       static variables & blocks--based on the order of the code
* static block of child class
* 
* non static block of parent class   non static variables & blocks--based on the order of the code
* constructor of parent class
* non static block of child class
* constructor of child class
* 
* 
* 
* non static blocks inside methods/blocks execute in order
*/

