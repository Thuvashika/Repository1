package learn.control;

import java.sql.*;
import java.util.LinkedList;

import learn.model.Lead;
public class LeadsControl {
	private String jdbcURL="jdbc:mysql://localhost:3306/leads";
	private String userName="root";
	private String passWord="Thuva@2001";
	private static final String INSERT_LEAD="INSERT INTO leads_information" + " (userid,name,email,region,contact) VALUES "+ " (?,?,?,?,?);"; 
	private static final String SELECT_LEAD_BY_ID="select id,name,email,region,contact from leads_information where userid=?";
	private static final String SELECT_ALL_LEADS="SELECT * FROM leads.leads_information;";
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
			// TODO Auto-generated catch block
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
			System.out.println(updationStatus);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return updationStatus;
	}
	public LinkedList<Lead> selectLeadsById(int userid) {
		LinkedList<Lead> lead=new LinkedList<Lead>();
		try(Connection connection = getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(SELECT_LEAD_BY_ID);){
			preparedStatement.setInt(1, userid);
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lead;
	}
	public LinkedList<Lead> selectAllLeads() {
		LinkedList<Lead> lead=new LinkedList<Lead>();
		try(Connection connection = getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(SELECT_ALL_LEADS);){
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
}
