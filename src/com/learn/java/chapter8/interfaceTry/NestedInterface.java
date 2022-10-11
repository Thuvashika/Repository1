package com.learn.java.chapter8.interfaceTry;

public interface NestedInterface {
	
	abstract class AbstractClass{
		
	}
	
	//interface can have inner class
	class NewClass{
		
		//class inside interface can have concrete methods
		public void methodTry() {
			
		}
		
		//interface inside class
		static interface NewInterface1{
			public void print();
		}
		
		
		//nested interface are automatically static 
		interface NewInterface2{
			public void display();
		}
	}
	
	class AnotherClass implements  NewClass.NewInterface1{

		@Override
		public void print() {
			System.out.println("implemented print method");
			
		}
		
	}
	
	class AnotherNewClass implements NewClass.NewInterface2{

		@Override
		public void display() {
			System.out.println("implemented display method");
			
		}
		
	}
	
	//interface inside interface
	interface NewInterface3{
		public void main();
	}

}
class AnotherClass implements NestedInterface{
	
}
