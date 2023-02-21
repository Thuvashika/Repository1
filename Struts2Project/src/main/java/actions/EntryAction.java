//$Id$
package actions;

import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.action.SessionAware;
import org.apache.struts2.dispatcher.SessionMap;

import com.opensymphony.xwork2.ActionSupport;

import service.EntryCheck;

public class EntryAction extends ActionSupport implements SessionAware{
	private String Name;
	private String email;
	private String password;
	private SessionMap<String,Object> sessionMap;  
	public void validate() {
		if(StringUtils.isEmpty(getEmail())) { 
			addActionError("Email field is mandatory");
		}
		if(StringUtils.isEmpty(getPassword())) { 
			addActionError("Password field is mandatory");
		}
	}
	public String executeLogin(){
		EntryCheck obj=new EntryCheck();
		if(obj.isUserExist(email)){
			int userId=obj.selectUserByEmail(email);
			String actualPassword=obj.getPassword(userId);
			if(actualPassword.equals(password)) {
				sessionMap.put("Id", userId);
				return SUCCESS;
			}
			else {
				addActionError("Incorrect password");
			}
		}
		else {
			addActionError("Mail id does not exist");
		}
		return INPUT;
	}
	public String executeLogout(){
		System.out.println("Yes");
		sessionMap.invalidate();  
		return SUCCESS;
	}
	public String executeSignUp(){
		EntryCheck obj=new EntryCheck();
		if(obj.isUserExist(email)){
			addActionMessage("Mail already exist");
			return INPUT;
		}
		obj.insertUser(null);
		int userId=obj.selectUserByEmail(email);
		sessionMap.put("Id", userId);
		return SUCCESS;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public void withSession(Map<String, Object> map) {
		sessionMap=(SessionMap)map;  
	}
}
