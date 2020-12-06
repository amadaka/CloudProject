package Cloud.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Cloud.model.course;
import Cloud.util.SQLConnection;

public class courseDAO {
	static SQLConnection DBMgr = SQLConnection.getInstance();
	private static ArrayList<course> returnMatcingcourse(String queryString){
		ArrayList<course> courseListInDB=new ArrayList<course>();
		Statement stmt = null;
		Connection conn = SQLConnection.getDBConnection();
		try {
			stmt = conn.createStatement();
			ResultSet courseList=stmt.executeQuery(queryString);
			while(courseList.next()) {
				course cour=new course();
				cour.setId_class(courseList.getInt("idclass"));
				cour.setClassname(courseList.getString("classname"));
				cour.setPre(courseList.getString("prerequisites"));
				cour.setDuration(courseList.getString("Duration_week"));
				cour.setSpecialization(courseList.getString("Specialization"));
				cour.setIdcreate(courseList.getInt("idcreate"));
				cour.setTeacherid(courseList.getInt("teacherid"));
				cour.setSdate(courseList.getString("sdate"));
				cour.setEdate(courseList.getString("edate"));
				courseListInDB.add(cour);
			}
		}catch (SQLException e) {System.out.println("FAIL1");}
		return courseListInDB;
	}
	private static ArrayList<course> returnMatcingcourse2(String queryString){
		ArrayList<course> courseListInDB=new ArrayList<course>();
		Statement stmt = null;
		Connection conn = SQLConnection.getDBConnection();
		try {
			stmt = conn.createStatement();
			ResultSet courseList=stmt.executeQuery(queryString);
			while(courseList.next()) {
				course cour=new course();
				cour.setId_class(courseList.getInt("idclass"));
				cour.setClassname(courseList.getString("classname"));
				cour.setPre(courseList.getString("prerequisites"));
				cour.setDuration(courseList.getString("Duration_week"));
				cour.setSpecialization(courseList.getString("Specialization"));
				courseListInDB.add(cour);
			}
		}catch (SQLException e) {System.out.println("FAIL2");}
		return courseListInDB;
	}
	
	public static ArrayList<course> admincurlist(String date){
		return returnMatcingcourse("SELECT * FROM cloud.class join cloud.create on cloud.class.idclass=cloud.create.classid where sdate<='"+date+"' and edate>='"+date+"' order by cloud.create.sdate");
	}
	public static ArrayList<course> adminpastlist(String date){
		return returnMatcingcourse("SELECT * FROM cloud.class join cloud.create on cloud.class.idclass=cloud.create.classid where edate<'"+date+"' order by cloud.create.sdate");
	}
	public static ArrayList<course> adminupcominglist(String date){
		return returnMatcingcourse("SELECT * FROM cloud.class join cloud.create on cloud.class.idclass=cloud.create.classid where sdate>'"+date+"' order by cloud.create.sdate");
	}
	public static ArrayList<course> searchCourse(int id){
		return returnMatcingcourse("SELECT * FROM cloud.class join cloud.create on cloud.class.idclass=cloud.create.classid where idcreate="+id+" order by cloud.create.sdate");
	}
	
	////////////////////////teacher
	public static ArrayList<course> teachcurlist(String date,int id){
		return returnMatcingcourse("SELECT * FROM cloud.class join cloud.create on cloud.class.idclass=cloud.create.classid where sdate<='"+date+"' and edate>='"+date+"' and teacherid="+id+" order by cloud.create.sdate");
	}
	public static ArrayList<course> teachpastlist(String date,int id){
		return returnMatcingcourse("SELECT * FROM cloud.class join cloud.create on cloud.class.idclass=cloud.create.classid where edate<'"+date+"' and teacherid="+id+" order by cloud.create.sdate");
	}
	public static ArrayList<course> teachupcominglist(String date,int id){
		return returnMatcingcourse("SELECT * FROM cloud.class join cloud.create on cloud.class.idclass=cloud.create.classid where sdate>'"+date+"' and teacherid="+id+" order by cloud.create.sdate");
	}
	
	//////////////////////////Student
	public static ArrayList<course> stucurlist(String date,int id){
		return returnMatcingcourse("SELECT * FROM ((cloud.create join cloud.class on cloud.class.idclass=cloud.create.classid) join cloud.reserve on cloud.reserve.createid= cloud.create.idcreate) where sdate<='"+date+"' and edate>='"+date+"' and cloud.reserve.userid="+id+" order by cloud.create.sdate");
	}
	public static ArrayList<course> stupastlist(String date,int id){
		return returnMatcingcourse("SELECT * FROM ((cloud.create join cloud.class on cloud.class.idclass=cloud.create.classid) join cloud.reserve on cloud.reserve.createid= cloud.create.idcreate) where edate<'"+date+"' and cloud.reserve.userid="+id+" order by cloud.create.sdate");
	}
	public static ArrayList<course> stuupcominglist(String date,int id){
		return returnMatcingcourse("SELECT * FROM ((cloud.create join cloud.class on cloud.class.idclass=cloud.create.classid) join cloud.reserve on cloud.reserve.createid= cloud.create.idcreate) where sdate>'"+date+"' and cloud.reserve.userid="+id+" order by cloud.create.sdate");
	}
	
	
	//SELECT * FROM cloud.class;
	public static ArrayList<course> simplecourse(){
		return returnMatcingcourse2("SELECT * FROM cloud.class");
	}
	public static ArrayList<course> simplecourseID(int id){
		return returnMatcingcourse2("SELECT * FROM cloud.class where cloud.class.idclass="+id);
	}
	public static void insertcourse(course course) {
		Statement stmt = null;
		Connection conn = SQLConnection.getDBConnection();
		try {
			stmt = conn.createStatement();
			String insert="INSERT INTO cloud.create (teacherid, classid, sdate, edate) VALUES ('"
					+course.getTeacherid()+"','"
					+course.getId_class()+"','"
					+course.getSdate()+"','"
					+course.getEdate()+"')";
			stmt.executeUpdate(insert);
			conn.commit();
		}catch(SQLException e) {System.out.println("FAILhere");}
	}
	public static void deletecourse(int id) {
		Statement stmt = null;
		Connection conn = SQLConnection.getDBConnection();
		try {
			stmt = conn.createStatement();
			String delete="DELETE FROM cloud.create WHERE idcreate="+id;
			stmt.executeUpdate(delete);
			conn.commit();
		}catch(SQLException e) {System.out.println("FAILhere2");}
	}
	public static void updatecourse(course course) {
		Statement stmt = null;
		Connection conn = SQLConnection.getDBConnection();
		try {
			stmt = conn.createStatement();
			String delete="UPDATE cloud.create SET teacherid="+course.getTeacherid()+", sdate='"+course.getSdate()+"', `edate`='"+course.getEdate()+"' WHERE `idcreate`="+course.getIdcreate();
			stmt.executeUpdate(delete);
			conn.commit();
		}catch(SQLException e) {System.out.println("FAILhere2");}
	}
}
