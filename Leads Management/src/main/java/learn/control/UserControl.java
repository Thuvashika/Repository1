package learn.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import learn.model.User;
public class UserControl {
	private String jdbcURL="jdbc:mysql://localhost:3306/leads";
	private String userName="root";
	private String passWord="Thuva@2001";
	private static final String INSERT_USER="INSERT INTO leads.users_information" + " (username,email,password) VALUES "+ " (?,?,?);"; 
	private static final String SELECT_USER_BY_EMAIL="select userid,username,password from leads.users_information where email=?";
	private static final String GET_ID="select userIid from leads.users_information where email=?";
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
	public int insertUser(User user) {
		int id=0;
		try(Connection connection = getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(INSERT_USER);){
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getPassword());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;
		
		
	}
	public void setId(User user) {
	
		try(Connection connection = getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(GET_ID);){
			preparedStatement.setString(1, user.getEmail());
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				int id=rs.getInt("userid");
				user.setId(id);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public User selectUserByEmail(String email) {
		User user=null;
		try(Connection connection = getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(SELECT_USER_BY_EMAIL);){
			preparedStatement.setString(1, email);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				int id=rs.getInt("userid");
				String name=rs.getString("username");
				String password=rs.getString("password");
				System.out.println(password);
				user=new User(id,name,email,password);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	public boolean isUserExist(String email) {
		boolean status=false;
		try(Connection connection = getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(SELECT_USER_BY_EMAIL);){
			preparedStatement.setString(1, email);
			ResultSet rs=preparedStatement.executeQuery();
			//System.out.println(email);
			//status=preparedStatement.executeUpdate()>1;
			if(rs.next()) {
				return true;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
}
