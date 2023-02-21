//$Id$
package actions;

import java.sql.SQLException;
import java.util.LinkedList;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import model.Lead;
import service.LeadsOperation;

public class LeadsAction extends ActionSupport{
	private String name;
	private String email;
	private String region;
	private String contact;
	private String column;
	private String word;
	private LeadsOperation obj=new LeadsOperation();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private int start;
	private int no;
	private int id;
	private LinkedList<Lead> list;
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String records(){
		HttpSession session=ServletActionContext.getRequest().getSession(false);  
		if(session==null || session.getAttribute("Id")==null){  
			addActionError("Email field is mandatory");
			return LOGIN;
        }  
		int userId=1;
		list=obj.selectLeadsById(userId, start, no);
		return SUCCESS;
		
	}
	public String allRecords(){
		 HttpSession session=ServletActionContext.getRequest().getSession(false);  
			if(session==null || session.getAttribute("Id")==null){  
				addActionError("Email field is mandatory");
				return LOGIN;
	        }  
		list=obj.selectAllLeads(start, no);
		return SUCCESS;
		
	}
	public String delete(){
		try {
			obj.deleteLead(id);
		} catch (SQLException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
		
	}
	public String edit() {
		Lead leadObj=new Lead(name,email,region,contact);
		obj.updateLead(leadObj,id);
		return SUCCESS;
	}
	public String add() {
		Lead leadObj=new Lead(name,email,region,contact);
		obj.insertLead(leadObj,1);
		return SUCCESS;
	}
	public String search() {
		switch(column) {
		 case "name":
			 list=obj.selectLeadsByName(1,word);
			 break;
		 case "id":
			 int newWord=Integer.parseInt(word);
			 list=obj.selectLeadsById(1,newWord);
			 break;
		 case "email":
			 list=obj.selectLeadsByEmail(1,word);
			 break;
		 case "region":
			 list=obj.selectLeadsByRegion(1,word);
			 break;
		 case "contact":
			 list=obj.selectLeadsByContact(1,word);
			 break;
	 	}
		return SUCCESS;
	}
	public String searchAll() {
		switch(column) {
		 case "name":
			 list=obj.selectLeadsByName(word);
			 break;
		 case "id":
			 int newWord=Integer.parseInt(word);
			 list=obj.selectLeadsById(newWord);
			 break;
		 case "email":
			 list=obj.selectLeadsByEmail(word);
			 break;
		 case "region":
			 list=obj.selectLeadsByRegion(word);
			 break;
		 case "contact":
			 list=obj.selectLeadsByContact(word);
			 break;
		 case "userid":
			 int intWord=Integer.parseInt(word);
			list=obj.selectLeadsByUserId(intWord);
	 	}
		return SUCCESS;
	}
	public String getColumn() {
		return column;
	}
	public void setColumn(String column) {
		this.column = column;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public LinkedList<Lead> getList() {
		return list;
	}
	public void setList(LinkedList<Lead> list) {
		this.list = list;
	}
}
