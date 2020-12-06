package Cloud.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Cloud.data.courseDAO;
import Cloud.data.userDAO;
import Cloud.model.course;
import Cloud.model.user;

/**
 * Servlet implementation class courseController
 */
@WebServlet("/courseController")
public class courseController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action"), url="";
		HttpSession session = request.getSession();
		course cour=new course();
		if(action.equalsIgnoreCase("admincurrlist")) {
			String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
			
			ArrayList<course> courseList=new ArrayList<course>();
			courseList=courseDAO.admincurlist(date);
			System.out.println(courseList.get(0).getId_class());
			session.setAttribute("CurCourse", courseList);
			url="/admincurlist.jsp";
		}
		else if(action.equalsIgnoreCase("teachcurrlist")) {
			String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
			ArrayList<course> courseList=new ArrayList<course>();
			user loginU=(user) session.getAttribute("loginU");
			int id=loginU.getId_user();
			courseList=courseDAO.teachcurlist(date, id);
			//System.out.println(courseList.get(0).getId_class());
			session.setAttribute("CurinsCourse", courseList);
			url="/InstructorCurClass.jsp";
		}
		else if(action.equalsIgnoreCase("studentcurrlist")) {
			String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
			ArrayList<course> courseList=new ArrayList<course>();
			user loginU=(user) session.getAttribute("loginU");
			int id=loginU.getId_user();
			courseList=courseDAO.stucurlist(date, id);
			//System.out.println(courseList.get(0).getId_class());
			session.setAttribute("CurstuCourse", courseList);
			url="/studentcurrlist.jsp";
		}
		else if(action.equalsIgnoreCase("adminpastlist")) {
			String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
			ArrayList<course> courseList=new ArrayList<course>();
			courseList=courseDAO.adminpastlist(date);
			session.setAttribute("pastCourse", courseList);
			url="/AdminPast.jsp";
		}
		else if(action.equalsIgnoreCase("teachpastlist")) {
			String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
			ArrayList<course> courseList=new ArrayList<course>();
			user loginU=(user) session.getAttribute("loginU");
			int id=loginU.getId_user();
			courseList=courseDAO.teachpastlist(date, id);
			session.setAttribute("pastinsCourse", courseList);
			url="/InstructorPastCourse.jsp";
		}
		else if(action.equalsIgnoreCase("studentpastlist")) {
			String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
			ArrayList<course> courseList=new ArrayList<course>();
			user loginU=(user) session.getAttribute("loginU");
			int id=loginU.getId_user();
			courseList=courseDAO.stupastlist(date, id);
			session.setAttribute("paststuCourse", courseList);
			url="/studentpastlist.jsp";
		}
		else if(action.equalsIgnoreCase("adminupcominglist")) {
			String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
			ArrayList<course> courseList=new ArrayList<course>();
			courseList=courseDAO.adminupcominglist(date);
			session.setAttribute("upCourse", courseList);
			url="/AdminUpcoming.jsp";
		}
		else if(action.equalsIgnoreCase("teachupcominglist")) {
			String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
			ArrayList<course> courseList=new ArrayList<course>();
			user loginU=(user) session.getAttribute("loginU");
			int id=loginU.getId_user();
			courseList=courseDAO.teachupcominglist(date, id);
			session.setAttribute("upinsCourse", courseList);
			url="/InstructorUpcomingCourse.jsp";
		}
		else if(action.equalsIgnoreCase("studentupcominglist")) {
			String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
			ArrayList<course> courseList=new ArrayList<course>();
			user loginU=(user) session.getAttribute("loginU");
			int id=loginU.getId_user();
			courseList=courseDAO.stuupcominglist(date, id);
			session.setAttribute("upstuCourse", courseList);
			url="/studentUpcominglist.jsp";
		}
		else if(action.equalsIgnoreCase("studentallupcominglist")) {
			String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
			ArrayList<course> courseList=new ArrayList<course>();
			courseList=courseDAO.adminupcominglist(date);
			session.setAttribute("upallstuCourse", courseList);
			url="/studentAllUpcominglist.jsp";
		}
		else if(action.equalsIgnoreCase("redirectCreatePage")) {
			ArrayList<user> teacherinDB=new ArrayList<user>();
			teacherinDB=userDAO.searchTeacher();
			session.setAttribute("TeacherList",teacherinDB);
			ArrayList<course> courseList=new ArrayList<course>();
			courseList=courseDAO.simplecourse();
			session.setAttribute("courseList",courseList);
			url="/AdminCreateClass.jsp";
		}
		else if(action.equalsIgnoreCase("createClass")) {
			int classid=Integer.parseInt(request.getParameter("course"));
			int teachid=Integer.parseInt(request.getParameter("teach"));
			String date=request.getParameter("date");
			ArrayList<course> courseList=new ArrayList<course>();
			courseList=courseDAO.simplecourseID(classid);
//			ArrayList<user> teacherinDB=new ArrayList<user>();
//			teacherinDB=userDAO.searchUserID(teachid);
			//cour.setCourse(id_class, classname, pre, duration, specialization, idcreate, sdate, edate, teacherid);
			cour.setCourse2(classid, courseList.get(0).getClassname(), courseList.get(0).getPre(), courseList.get(0).getDuration(), courseList.get(0).getSpecialization());
			cour.setSdate(date);
			int days=Integer.parseInt(cour.getDuration())*7;
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			try{
			   //Setting the date to the given date
			   c.setTime(sdf.parse(date));
			}catch(ParseException e){
				e.printStackTrace();
			 }
			   
			//Number of Days to add
			c.add(Calendar.DAY_OF_MONTH, days);  
			cour.setEdate(sdf.format(c.getTime()));
			cour.setTeacherid(teachid);
			courseDAO.insertcourse(cour);;
			url="/courseController?action=admincurrlist";
		}
		else if(action.equalsIgnoreCase("SpecifyClass")){
			int createid=Integer.parseInt(request.getParameter("id"));
			ArrayList<course> courseList=new ArrayList<course>();
			courseList=courseDAO.searchCourse(createid);
			cour.setCourse(courseList.get(0).getId_class(), courseList.get(0).getClassname(), courseList.get(0).getPre(), courseList.get(0).getDuration(), courseList.get(0).getSpecialization(), courseList.get(0).getIdcreate(), courseList.get(0).getSdate(),courseList.get(0).getEdate(), courseList.get(0).getTeacherid());
			if(cour.getPre()==null) {
				cour.setPre("N/A");
			}
			session.setAttribute("cour",cour);
			ArrayList<user> UserinDB=new ArrayList<user>();
			UserinDB=userDAO.searchUserID(cour.getTeacherid());
			user teacher=new user();
			teacher.setUser(UserinDB.get(0).getUsername(), UserinDB.get(0).getFirst_name(), UserinDB.get(0).getLast_name(), UserinDB.get(0).getPassword(), UserinDB.get(0).getRole(), UserinDB.get(0).getPhone(), UserinDB.get(0).getEmail(), UserinDB.get(0).getOrganization());
			session.setAttribute("teacher",teacher);
			url="/AdminClassView.jsp";
		}
		else if(action.equalsIgnoreCase("SpecifyClassStud")){
			int createid=Integer.parseInt(request.getParameter("id"));
			ArrayList<course> courseList=new ArrayList<course>();
			courseList=courseDAO.searchCourse(createid);
			cour.setCourse(courseList.get(0).getId_class(), courseList.get(0).getClassname(), courseList.get(0).getPre(), courseList.get(0).getDuration(), courseList.get(0).getSpecialization(), courseList.get(0).getIdcreate(), courseList.get(0).getSdate(),courseList.get(0).getEdate(), courseList.get(0).getTeacherid());
			if(cour.getPre()==null) {
				cour.setPre("N/A");
			}
			session.setAttribute("courS",cour);
			ArrayList<user> UserinDB=new ArrayList<user>();
			UserinDB=userDAO.searchUserID(cour.getTeacherid());
			user teacher=new user();
			teacher.setUser(UserinDB.get(0).getUsername(), UserinDB.get(0).getFirst_name(), UserinDB.get(0).getLast_name(), UserinDB.get(0).getPassword(), UserinDB.get(0).getRole(), UserinDB.get(0).getPhone(), UserinDB.get(0).getEmail(), UserinDB.get(0).getOrganization());
			session.setAttribute("teacherS",teacher);
			url="/StudentViewClassUp.jsp";
		}
		else if(action.equalsIgnoreCase("SpecifyClassStudP")){
			int createid=Integer.parseInt(request.getParameter("id"));
			ArrayList<course> courseList=new ArrayList<course>();
			courseList=courseDAO.searchCourse(createid);
			cour.setCourse(courseList.get(0).getId_class(), courseList.get(0).getClassname(), courseList.get(0).getPre(), courseList.get(0).getDuration(), courseList.get(0).getSpecialization(), courseList.get(0).getIdcreate(), courseList.get(0).getSdate(),courseList.get(0).getEdate(), courseList.get(0).getTeacherid());
			if(cour.getPre()==null) {
				cour.setPre("N/A");
			}
			session.setAttribute("courSP",cour);
			ArrayList<user> UserinDB=new ArrayList<user>();
			UserinDB=userDAO.searchUserID(cour.getTeacherid());
			user teacher=new user();
			teacher.setUser(UserinDB.get(0).getUsername(), UserinDB.get(0).getFirst_name(), UserinDB.get(0).getLast_name(), UserinDB.get(0).getPassword(), UserinDB.get(0).getRole(), UserinDB.get(0).getPhone(), UserinDB.get(0).getEmail(), UserinDB.get(0).getOrganization());
			session.setAttribute("teacherSP",teacher);
			url="/lectureController?action=lecturelistsp&id="+createid;
		}
		else if(action.equalsIgnoreCase("SpecifyClassteachC")) {
			int createid=Integer.parseInt(request.getParameter("id"));
			ArrayList<course> courseList=new ArrayList<course>();
			courseList=courseDAO.searchCourse(createid);
			cour.setCourse(courseList.get(0).getId_class(), courseList.get(0).getClassname(), courseList.get(0).getPre(), courseList.get(0).getDuration(), courseList.get(0).getSpecialization(), courseList.get(0).getIdcreate(), courseList.get(0).getSdate(),courseList.get(0).getEdate(), courseList.get(0).getTeacherid());
			if(cour.getPre()==null) {
				cour.setPre("N/A");
			}
			session.setAttribute("courT",cour);
			url="/lectureController?action=lecturelist&id="+createid;
//			url="/InstuctorViewClass.jsp";
		}
		else if(action.equalsIgnoreCase("SpecifyClassteachP")) {
			int createid=Integer.parseInt(request.getParameter("id"));
			ArrayList<course> courseList=new ArrayList<course>();
			courseList=courseDAO.searchCourse(createid);
			cour.setCourse(courseList.get(0).getId_class(), courseList.get(0).getClassname(), courseList.get(0).getPre(), courseList.get(0).getDuration(), courseList.get(0).getSpecialization(), courseList.get(0).getIdcreate(), courseList.get(0).getSdate(),courseList.get(0).getEdate(), courseList.get(0).getTeacherid());
			if(cour.getPre()==null) {
				cour.setPre("N/A");
			}
			session.setAttribute("courT",cour);
			url="/lectureController?action=lecturelistp&id="+createid;
//			url="/InstuctorViewClass.jsp";
		}
		else if(action.equalsIgnoreCase("SpecifyClassteachU")) {
			int createid=Integer.parseInt(request.getParameter("id"));
			ArrayList<course> courseList=new ArrayList<course>();
			courseList=courseDAO.searchCourse(createid);
			cour.setCourse(courseList.get(0).getId_class(), courseList.get(0).getClassname(), courseList.get(0).getPre(), courseList.get(0).getDuration(), courseList.get(0).getSpecialization(), courseList.get(0).getIdcreate(), courseList.get(0).getSdate(),courseList.get(0).getEdate(), courseList.get(0).getTeacherid());
			if(cour.getPre()==null) {
				cour.setPre("N/A");
			}
			session.setAttribute("courTU",cour);
			url="/InstructorViewClassUp.jsp";
		}
		else if(action.equalsIgnoreCase("deleteClass")) {
			int createid=Integer.parseInt(request.getParameter("id"));
			courseDAO.deletecourse(createid);
			url="/courseController?action=adminupcominglist";
		}
		else if(action.equalsIgnoreCase("Redirectedit")){
			int createid=Integer.parseInt(request.getParameter("id"));
			ArrayList<course> courseList=new ArrayList<course>();
			courseList=courseDAO.searchCourse(createid);
			cour.setCourse(courseList.get(0).getId_class(), courseList.get(0).getClassname(), courseList.get(0).getPre(), courseList.get(0).getDuration(), courseList.get(0).getSpecialization(), courseList.get(0).getIdcreate(), courseList.get(0).getSdate(),courseList.get(0).getEdate(), courseList.get(0).getTeacherid());
			if(cour.getPre()==null) {
				cour.setPre("N/A");
			}
			session.setAttribute("cour",cour);
			ArrayList<user> UserinDB=new ArrayList<user>();
			UserinDB=userDAO.searchUserID(cour.getTeacherid());
			user teacher=new user();
			teacher.setUser(UserinDB.get(0).getUsername(), UserinDB.get(0).getFirst_name(), UserinDB.get(0).getLast_name(), UserinDB.get(0).getPassword(), UserinDB.get(0).getRole(), UserinDB.get(0).getPhone(), UserinDB.get(0).getEmail(), UserinDB.get(0).getOrganization());
			session.setAttribute("teacher",teacher);
			url="/AdmineditClass.jsp";
		}
		else if(action.equalsIgnoreCase("editClass")) {
			int createid=Integer.parseInt(request.getParameter("id"));
			String date=request.getParameter("newdate");
			int teachid=Integer.parseInt(request.getParameter("teachidnew"));
			ArrayList<course> courseList=new ArrayList<course>();
			courseList=courseDAO.searchCourse(createid);
			cour.setCourse(courseList.get(0).getId_class(), courseList.get(0).getClassname(), courseList.get(0).getPre(), courseList.get(0).getDuration(), courseList.get(0).getSpecialization(), courseList.get(0).getIdcreate(), courseList.get(0).getSdate(),courseList.get(0).getEdate(), courseList.get(0).getTeacherid());
			int days=Integer.parseInt(cour.getDuration())*7;
			cour.setSdate(date);
			cour.setTeacherid(teachid);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			try{
			   //Setting the date to the given date
			   c.setTime(sdf.parse(date));
			}catch(ParseException e){
				e.printStackTrace();
			 }
			//Number of Days to add
			c.add(Calendar.DAY_OF_MONTH, days);  
			cour.setEdate(sdf.format(c.getTime()));
			courseDAO.updatecourse(cour);
			ArrayList<user> teacherinDB=new ArrayList<user>();
			teacherinDB=userDAO.searchTeacher();
			session.setAttribute("TeacherList",teacherinDB);
			url="/courseController?action=adminupcominglist";
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
		
	}
}
