//$Id$
package learn.entry;

import learn.control.UserControl;
import learn.model.User;

public class MultipleUser implements Runnable{
	String name,email,password;
	MultipleUser(String name,String email,String password){
		this.name=name;
		this.email=email;
		this.password=password;
	}
	public void check() {
		UserControl controlObj=new UserControl();
		User obj=new User(name,email, password);
		for(int i=0;i<10;i++) {
			if(controlObj.isUserExist(email)) {
				System.out.println("user Exist");
			}
			else {
				controlObj.insertUser(obj);
			}
			if(controlObj.isUserExist(email)) {
				System.out.println("user Exist");
			}
			else {
				controlObj.insertUser(obj);
			}
			if(controlObj.isUserExist(email)) {
				System.out.println("user Exist");
			}
			else {
				controlObj.insertUser(obj);
			}
		}
	}
	@Override
	public void run() {
		System.out.println("Number of threads " + Thread.activeCount());
		//check();
	}

}
