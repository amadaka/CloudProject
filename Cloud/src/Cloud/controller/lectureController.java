package Cloud.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Cloud.data.lectureDAO;
import Cloud.model.lecture;

/**
 * Servlet implementation class lectureController
 */
@WebServlet("/lectureController")
public class lectureController extends HttpServlet {
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
		lecture lecture=new lecture();
		if(action.equalsIgnoreCase("lecturelist")) {
			int createid=Integer.parseInt(request.getParameter("id"));
			ArrayList<lecture> lecturelist=new ArrayList<lecture>();
			lecturelist=lectureDAO.lectureclass(createid);
//			System.out.println("reached");
			session.setAttribute("lecturelist",lecturelist);
			url="/InstuctorViewClass.jsp";
		}
		else if(action.equalsIgnoreCase("lecturelistp")) {
			int createid=Integer.parseInt(request.getParameter("id"));
			ArrayList<lecture> lecturelist=new ArrayList<lecture>();
			lecturelist=lectureDAO.lectureclass(createid);
//			System.out.println("reached");
			session.setAttribute("lecturelist",lecturelist);
			url="/InstructorViewClassPa.jsp";
		}
		else if(action.equalsIgnoreCase("lecturelistsp")) {
			int createid=Integer.parseInt(request.getParameter("id"));
			ArrayList<lecture> lecturelist=new ArrayList<lecture>();
			lecturelist=lectureDAO.lectureclass(createid);
//			System.out.println("reached");
			session.setAttribute("lecturelistC",lecturelist);
			url="/StudentClassView.jsp";
		}
		else if(action.equalsIgnoreCase("createlecture")){
			int createid=Integer.parseInt(request.getParameter("id"));
			lecture.setName(request.getParameter("llname"));//llname
			lecture.setLink(request.getParameter("llline"));
			String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
			lecture.setDate(date);
			lecture.setIdcreate(createid);
			lectureDAO.createlecture(lecture);
			url="/courseController?action=SpecifyClassteachC&id="+createid;
		}
		
		getServletContext().getRequestDispatcher(url).forward(request, response);

	}

}
