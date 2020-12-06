package Cloud.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Cloud.model.reserve;
import Cloud.util.SQLConnection;

public class reserveDAO {
	static SQLConnection DBMgr = SQLConnection.getInstance();
	private static ArrayList<reserve> returnMatcingreserve(String queryString){
		ArrayList<reserve> reservelistinDB=new ArrayList<reserve>();
		Statement stmt = null;
		Connection conn = SQLConnection.getDBConnection();
		try {
			stmt = conn.createStatement();
			ResultSet reservelist=stmt.executeQuery(queryString);
			while(reservelist.next()) {
				reserve reserve=new reserve();
				reserve.setId_user(reservelist.getInt("userid"));
				reserve.setIdcreate(reservelist.getInt("createid"));
				reserve.setIdreserve(reservelist.getInt("idreserve"));
				reservelistinDB.add(reserve);
			}
		}catch (SQLException e) {System.out.println("FAIL1");}
		return reservelistinDB;
	}
	
	public static void createreserve(reserve reserve) {
		Statement stmt = null;
		Connection conn = SQLConnection.getDBConnection();
		try {
			stmt = conn.createStatement();
			String insert="INSERT INTO cloud.reserve (userid,createid) VALUES ("+reserve.getId_user()+","+reserve.getIdcreate()+")";
			stmt.executeUpdate(insert);
			conn.commit();
		}catch(SQLException e) {System.out.println("FAIL2");}
	}
	public static void deletereserve(reserve reserve) {
		Statement stmt = null;
		Connection conn = SQLConnection.getDBConnection();
		String delete="DELETE FROM cloud.reserve WHERE userid="+reserve.getId_user()+" and createid="+reserve.getIdcreate();
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(delete);
			conn.commit();
		}catch(SQLException e) {System.out.println(delete);}
	}
}
