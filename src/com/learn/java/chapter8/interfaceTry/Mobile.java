package com.learn.java.chapter8.interfaceTry;


//interface cannot implement another interface
//super interface is always an interface
public interface Mobile extends Calculator{
	
	/**{
	 * interface will not have initializer
	}**/
	
	
	/**Mobile(){
		interface will not have constructor
	}**/
	
	//parent method 
	int pro(int...arr) ;
	
	public void display();
	
	public void keypad();
	
	public static void print() {
		
		//final fields cannot be changed
		/**{
			pi=22;
		    var=20;
		    Area="cube";
		    root4=3;
		}**/
		
		
		System.out.println(pi);
		System.out.println(var);
		System.out.println(Area);
		System.out.println(root4);
	}
}
