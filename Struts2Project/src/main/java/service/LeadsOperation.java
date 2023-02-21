//$Id$
package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import model.Lead;
public class LeadsOperation {
	private String jdbcURL="jdbc:mysql://localhost:3306/leads";
	private String userName="root";
	private String passWord="Thuva@2001";
	private static final String INSERT_LEAD="INSERT INTO leads_information" + " (userid,name,email,region,contact) VALUES "+ " (?,?,?,?,?);";
	private static final String SELECT_LEAD_BY_EMAIL="SELECT * FROM leads.leads_information where userid=? and email like ?;";
	private static final String SELECT_LEAD_BY_NAME="SELECT * FROM leads.leads_information where userID=? and name like ?;";
	private static final String SELECT_LEAD_BY_ID="SELECT * FROM leads.leads_information where userID=? and id like ?;";
	private static final String SELECT_LEAD_BY_REGION="SELECT * FROM leads.leads_information where userID=? and region like ?;";
	private static final String SELECT_LEAD_BY_CONTACT="SELECT * FROM leads.leads_information where userID=? and contact like ?;";
	private static final String SELECT_LEAD_BY_USERID="SELECT * FROM leads.leads_information where userid=? LIMIT  ?,?;";
	private static final String SELECTALL_LEAD_BY_EMAIL="SELECT * FROM leads.leads_information where email like ?;";
	private static final String SELECTALL_LEAD_BY_NAME="SELECT * FROM leads.leads_information where name like ?;";
	private static final String SELECTALL_LEAD_BY_ID="SELECT * FROM leads.leads_information where id like ?;";
	private static final String SELECTALL_LEAD_BY_REGION="SELECT * FROM leads.leads_information where region like ?;";
	private static final String SELECTALL_LEAD_BY_CONTACT="SELECT * FROM leads.leads_information where contact like ?;";
	private static final String SELECTALL_LEAD_BY_USERID="SELECT * FROM leads.leads_information where userid like ?;";
	private static final String SELECT_ALL_LEADS="SELECT * FROM leads.leads_information LIMIT  ?,?;";
	private static final String DELETE_LEAD="delete from leads_information where id=?;";
	private static final String UPDATE_LEAD="update leads_information set name=?,email=?,region=?,contact=? where id=?;";
	protected Connection getConnection(){
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, userName, passWord);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		
	}
	public void insertLead(Lead lead,int userid) {
		try(Connection connection = getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(INSERT_LEAD);){
			preparedStatement.setInt(1, userid);
			preparedStatement.setString(2, lead.getName());
			preparedStatement.setString(3, lead.getEmail());
			preparedStatement.setString(4, lead.getRegion());
			preparedStatement.setString(5, lead.getContact());
			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public boolean updateLead(Lead lead,int id){
		boolean updationStatus = false;
		try(Connection connection = getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(UPDATE_LEAD);){
			preparedStatement.setString(1, lead.getName());
			preparedStatement.setString(2, lead.getEmail());
			preparedStatement.setString(3, lead.getRegion());
			preparedStatement.setString(4, lead.getContact());
			preparedStatement.setInt(5, id);
			preparedStatement.executeUpdate();
			updationStatus=preparedStatement.executeUpdate()>1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return updationStatus;
	}
	public LinkedList<Lead> selectLeadsById(int userid, int start, int end) {
		LinkedList<Lead> lead=new LinkedList<Lead>();
		try(Connection connection = getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(SELECT_LEAD_BY_USERID);){
			preparedStatement.setInt(1, userid);
			preparedStatement.setInt(2, start);
			preparedStatement.setInt(3, end);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String email=rs.getString("email");
				String region=rs.getString("region");
				String contact=rs.getString("contact");
				lead.add(new Lead(id,name,email,region,contact));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lead;
	}
	public LinkedList<Lead> selectAllLeads(int start, int end) {
		LinkedList<Lead> lead=new LinkedList<Lead>();
		try(Connection connection = getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(SELECT_ALL_LEADS);){
			preparedStatement.setInt(1, start);
			preparedStatement.setInt(2, end);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				int userId=rs.getInt("userid");
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String email=rs.getString("email");
				String region=rs.getString("region");
				String contact=rs.getString("contact");
				lead.add(new Lead(userId,id,name,email,region,contact));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lead;
	}
	public boolean deleteLead(int id) throws SQLException {
		boolean deleteStatus;
		try(Connection connection = getConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(DELETE_LEAD);){
			preparedStatement.setInt(1, id);
			deleteStatus=preparedStatement.executeUpdate()>1;
				
			}
		return deleteStatus;
	}
	public LinkedList<Lead> selectLeadsByEmail(String email){
		LinkedList<Lead> lead=new LinkedList<Lead>();
		try(Connection connection = getConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(SELECTALL_LEAD_BY_EMAIL);){
				preparedStatement.setString(1, "%"+email+"%");
				ResultSet rs=preparedStatement.executeQuery();
				while(rs.next()) {
					int userId= rs.getInt("userid");
					int id=rs.getInt("id");
					String name=rs.getString("name");
					String newEmail=rs.getString("email");
					String region=rs.getString("region");
					String contact=rs.getString("contact");
					lead.add(new Lead(userId,id,name,newEmail,region,contact));
				}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lead;
	}
	public LinkedList<Lead> selectLeadsByName(String name){
		LinkedList<Lead> lead=new LinkedList<Lead>();
		try(Connection connection = getConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(SELECTALL_LEAD_BY_NAME);){
			preparedStatement.setString(1, "%"+name+"%");
				ResultSet rs=preparedStatement.executeQuery();
				while(rs.next()) {
					int userId= rs.getInt("userid");
					int id=rs.getInt("id");
					String newName=rs.getString("name");
					String email=rs.getString("email");
					String region=rs.getString("region");
					String contact=rs.getString("contact");
					lead.add(new Lead(userId,id,newName,email,region,contact));
				}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lead;
	}
	public LinkedList<Lead> selectLeadsById(int id){
		LinkedList<Lead> lead=new LinkedList<Lead>();
		try(Connection connection = getConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(SELECTALL_LEAD_BY_ID);){
				preparedStatement.setInt(1, id);
				ResultSet rs=preparedStatement.executeQuery();
				while(rs.next()) {
					int userId= rs.getInt("userid");
					String name=rs.getString("name");
					String email=rs.getString("email");
					String region=rs.getString("region");
					String contact=rs.getString("contact");
					lead.add(new Lead(userId,id,name,email,region,contact));
				}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lead;
	}
	public LinkedList<Lead> selectLeadsByUserId(int userId){
		LinkedList<Lead> lead=new LinkedList<Lead>();
		try(Connection connection = getConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(SELECTALL_LEAD_BY_USERID);){
				preparedStatement.setInt(1, userId);
				ResultSet rs=preparedStatement.executeQuery();
				while(rs.next()) {
					int id=rs.getInt("id");
					String name=rs.getString("name");
					String email=rs.getString("email");
					String region=rs.getString("region");
					String contact=rs.getString("contact");
					lead.add(new Lead(userId,id,name,email,region,contact));
				}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lead;
	}
	public LinkedList<Lead> selectLeadsByRegion(String region){
		LinkedList<Lead> lead=new LinkedList<Lead>();
		try(Connection connection = getConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(SELECTALL_LEAD_BY_REGION);){
				preparedStatement.setString(1, "%"+region+"%");
				ResultSet rs=preparedStatement.executeQuery();
				while(rs.next()) {
					int userId= rs.getInt("userid");
					int id=rs.getInt("id");
					String name=rs.getString("name");
					String email=rs.getString("email");
					String newRegion=rs.getString("region");
					String contact=rs.getString("contact");
					lead.add(new Lead(userId,id,name,email,newRegion,contact));
				}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lead;
	}
	public LinkedList<Lead> selectLeadsByContact(String contact){
		LinkedList<Lead> lead=new LinkedList<Lead>();
		try(Connection connection = getConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(SELECTALL_LEAD_BY_CONTACT);){	
				preparedStatement.setString(1, "%"+contact+"%");
				ResultSet rs=preparedStatement.executeQuery();
				while(rs.next()) {
					int id=rs.getInt("id");
					int userId= rs.getInt("userid");
					String name=rs.getString("name");
					String email=rs.getString("email");
					String region=rs.getString("region");
					String newContact=rs.getString("contact");
					lead.add(new Lead(userId,id,name,email,region,newContact));
				}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lead;
	}
public LinkedList<Lead> selectLeadsByEmail(int userId,String email){
	LinkedList<Lead> lead=new LinkedList<Lead>();
	try(Connection connection = getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(SELECT_LEAD_BY_EMAIL);){
			preparedStatement.setInt(1, userId);
			preparedStatement.setString(2, "%"+email+"%");
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String newEmail=rs.getString("email");
				String region=rs.getString("region");
				String contact=rs.getString("contact");
				lead.add(new Lead(id,name,newEmail,region,contact));
			}
	}catch (Exception e) {
		e.printStackTrace();
	}
	return lead;
}
public LinkedList<Lead> selectLeadsByName(int userId,String name){
	LinkedList<Lead> lead=new LinkedList<Lead>();
	try(Connection connection = getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(SELECT_LEAD_BY_NAME);){
		preparedStatement.setInt(1, userId);
		preparedStatement.setString(2, "%"+name+"%");
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				int id=rs.getInt("id");
				String newName=rs.getString("name");
				String email=rs.getString("email");
				String region=rs.getString("region");
				String contact=rs.getString("contact");
				lead.add(new Lead(id,newName,email,region,contact));
			}
	}catch (Exception e) {
		e.printStackTrace();
	}
	return lead;
}
public LinkedList<Lead> selectLeadsById(int userId,int id){
	LinkedList<Lead> lead=new LinkedList<Lead>();
	try(Connection connection = getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(SELECT_LEAD_BY_ID);){
			preparedStatement.setInt(1, userId);
			preparedStatement.setInt(2, id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				String name=rs.getString("name");
				String email=rs.getString("email");
				String region=rs.getString("region");
				String contact=rs.getString("contact");
				lead.add(new Lead(id,name,email,region,contact));
			}
	}catch (Exception e) {
		e.printStackTrace();
	}
	return lead;
}
public LinkedList<Lead> selectLeadsByRegion(int userId,String region){
	LinkedList<Lead> lead=new LinkedList<Lead>();
	try(Connection connection = getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(SELECT_LEAD_BY_REGION);){
			preparedStatement.setInt(1, userId);
			preparedStatement.setString(2, "%"+region+"%");
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String email=rs.getString("email");
				String newRegion=rs.getString("region");
				String contact=rs.getString("contact");
				lead.add(new Lead(id,name,email,newRegion,contact));
			}
	}catch (Exception e) {
		e.printStackTrace();
	}
	return lead;
}
public LinkedList<Lead> selectLeadsByContact(int userId,String contact){
	LinkedList<Lead> lead=new LinkedList<Lead>();
	try(Connection connection = getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(SELECT_LEAD_BY_CONTACT);){
			preparedStatement.setInt(1, userId);	
			preparedStatement.setString(2, "%"+contact+"%");
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String email=rs.getString("email");
				String region=rs.getString("region");
				String newContact=rs.getString("contact");
				lead.add(new Lead(id,name,email,region,newContact));
			}
	}catch (Exception e) {
		e.printStackTrace();
	}
	return lead;
}

}
