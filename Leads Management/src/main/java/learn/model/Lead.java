//$Id$
package learn.model;

public class Lead {
	private int id;
	private String name;
	private String email;
	private String region;
	private String contact;
	public Lead( String name, String email, String region, String contact) {
		super();
		this.name = name;
		this.email = email;
		this.region = region;
		this.contact=contact;
	}
	public Lead(int id,String name, String email, String region, String contact) {
		this(name,email,region,contact);
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getRegion() {
		return region;
	}
	public String getContact() {
		return contact;
	}	
}

