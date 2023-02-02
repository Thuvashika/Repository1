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
	private static final String SELECT_USER_BY_EMAIL="select userid  from leads.users_information where email=?";
	private static final String GET_PASSWORD="select password  from leads.users_information where userid=?";
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
	public void insertUser(User user) {
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
		
		
	}
	public String getPassword(int id) {
		String pass=null;
		try(Connection connection = getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(GET_PASSWORD);){
			preparedStatement.setInt(1, id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				pass=rs.getString("password");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pass;
		
	}
	public int selectUserByEmail(String email) {
		int userId=0;
		try(Connection connection = getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(SELECT_USER_BY_EMAIL);){
			preparedStatement.setString(1, email);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				userId =rs.getInt("userid");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userId;
	}
	public boolean isUserExist(String email) {
		boolean status=false;
		try(Connection connection = getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(SELECT_USER_BY_EMAIL);){
			preparedStatement.setString(1, email);
			ResultSet rs=preparedStatement.executeQuery();
			if(rs.next()) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
