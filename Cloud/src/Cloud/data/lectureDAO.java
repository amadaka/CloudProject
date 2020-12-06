package Cloud.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Cloud.model.lecture;
import Cloud.util.SQLConnection;

public class lectureDAO {
	static SQLConnection DBMgr = SQLConnection.getInstance();
	private static ArrayList<lecture> returnMatcinglecture(String queryString){
		ArrayList<lecture> lectureinDB=new  ArrayList<lecture>();
		Statement stmt = null;
		Connection conn = SQLConnection.getDBConnection();
		try {
			stmt = conn.createStatement();
			ResultSet lectureList=stmt.executeQuery(queryString);
			while(lectureList.next()) {
				lecture lecture=new lecture();
				lecture.setIdlec(lectureList.getInt("idLecture"));
				lecture.setDate(lectureList.getString("pdate"));
				lecture.setIdcreate(lectureList.getInt("createeid"));
				lecture.setLink(lectureList.getString("link"));
				lecture.setName(lectureList.getString("lname"));
				lectureinDB.add(lecture);
			}
		}catch (SQLException e) {System.out.println("FAIL1");}
		return lectureinDB;
	}
	
	public static ArrayList<lecture> lectureclass(int id){
		return returnMatcinglecture("SELECT * FROM cloud.lecture where cloud.lecture.createeid="+id);
	}
	
	public static void createlecture(lecture lecture) {
		Statement stmt = null;
		Connection conn = SQLConnection.getDBConnection();
		String insert="INSERT INTO cloud.lecture (lname,link,pdate,createeid) VALUES ('"
				+lecture.getName()+"','"
				+lecture.getLink()+"','"
				+lecture.getDate()+"',"
				+lecture.getIdcreate()+")";
		System.out.println(insert);
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(insert);
			conn.commit();
		}catch(SQLException e) {System.out.println("FAIL3");}	
	}

}
