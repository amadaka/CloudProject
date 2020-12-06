package Cloud.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Cloud.util.SQLConnection;
import Cloud.model.user;

public class userDAO {
	static SQLConnection DBMgr = SQLConnection.getInstance();
	private static ArrayList<user> returnMatcingusers(String queryString){
		ArrayList<user> userListInDB=new ArrayList<user>();
		Statement stmt = null;
		Connection conn = SQLConnection.getDBConnection();
		try {
			stmt = conn.createStatement();
			ResultSet userList=stmt.executeQuery(queryString);
			while(userList.next()) {
				user user=new user();
				user.setId_user(userList.getInt("id"));
				user.setUsername(userList.getString("username"));
				user.setFirst_name(userList.getString("firstName"));
				user.setLast_name(userList.getString("lastName"));
				user.setRole(userList.getString("role"));
				user.setPassword(userList.getString("password"));
				user.setPhone(userList.getString("phone"));
				user.setEmail(userList.getString("email"));
				user.setOrganization(userList.getString("organization"));
				userListInDB.add(user);
			}
		}catch (SQLException e) {System.out.println("FAIL1");}
		return userListInDB;
	}
	private static boolean emptycheck(String queryString){
		boolean ans=false;
		Statement stmt = null;
		Connection conn = SQLConnection.getDBConnection();
		try {
			stmt = conn.createStatement();
			ResultSet userList=stmt.executeQuery(queryString);
			if(userList.next()) {
				ans=false;
			}
			else {
				ans=true;
			}
		} catch (SQLException e) {System.out.println("FAIL3");}
		return ans;
	}
	public static boolean checkusername(String username){
		System.out.println(username);
		return emptycheck("SELECT * from user WHERE username='"+username+"'");
	}
	public static ArrayList<user> Searchusername(String username){
		return returnMatcingusers("SELECT * from user WHERE username='"+username+"'");
	}
	public static ArrayList<user> searchTeacher(){
		String query="SELECT * FROM cloud.user where role='teacher'";
		return returnMatcingusers(query);
	}
	public static ArrayList<user> searchUserID(int id){
		String query="SELECT * FROM cloud.user where id="+id;
		return returnMatcingusers(query);
	}
	
	public static void insertuser(user user) {
		Statement stmt = null;
		Connection conn = SQLConnection.getDBConnection();
		try {
			stmt = conn.createStatement();
			String insert="INSERT INTO user(username,email,password,firstName,lastName,phone,organization,role) VALUES ('"
					+user.getUsername()+"','"
					+user.getEmail()+"','"
					+user.getPassword()+"','"
					+user.getFirst_name()+"','"
					+user.getLast_name()+"','"
					+user.getPhone()+"','"
					+user.getOrganization()+"','"
					+user.getRole()+"')";
			stmt.executeUpdate(insert);
			conn.commit();
		}catch(SQLException e) {System.out.println("FAIL2");}
	}
}
