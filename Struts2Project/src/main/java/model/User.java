//$Id$
package model;

public class User {
	private int id;
	private String name;
	 private String email;
	 private String password;
	public User(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}
	public User(int id,String name, String email, String password) {
		this(name, email, password);
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setId(int id) {
		this.id=id;
	}
}
