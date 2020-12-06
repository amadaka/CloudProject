package Cloud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Cloud.model.user;
import Cloud.data.userDAO;

/**
 * Servlet implementation class userController
 */
@WebServlet("/userController")
public class userController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private void getUserParam(HttpServletRequest request, user user) {
		user.setUser(request.getParameter("uname"), request.getParameter("fname"), request.getParameter("lname"), request.getParameter("psw"), "student", request.getParameter("phone"), request.getParameter("Email"), request.getParameter("Organization"));
	}
       
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
		user user=new user();
		if(action.equalsIgnoreCase("registerUser")) {
			getUserParam(request,user);
			user.setCpassword(request.getParameter("rpsw"));
			String rpwd=user.getCpassword();
			String error=user.validateUser(action, user);
			if(!error.equals("")) {
				getUserParam(request,user);
				user.setCpassword(rpwd);
				session.setAttribute("errorMsgs",error);
				url="/home.jsp";
			}
			else {
				userDAO.insertuser(user);
				session.setAttribute("loginU", user);
				url="/studentcurrlist.jsp";
			}
			
		}
		else if(action.equalsIgnoreCase("login")) {
			String uname=request.getParameter("uname");
			String psw=request.getParameter("psw");
			System.out.println("1");
			user.setUsername(uname);
			user.setPassword(psw);
			String error=user.validateUser(action, user);
			if(error.equals("")) {
				if(user.getRole().equals("student")) {
					url="/courseController?action=studentcurrlist";
					session.setAttribute("loginU", user);
				}
				else if(user.getRole().equals("admin")) {
					//url="/admincurlist.jsp";
					url="/courseController?action=admincurrlist";
					session.setAttribute("loginU", user);
				}
				else {
					url="/courseController?action=teachcurrlist";
					session.setAttribute("loginU", user);
				}
			}
			else {
				session.setAttribute("logerror",error);
				url="/home.jsp";
				
			}
		}
//		else if(action.equalsIgnoreCase("logout")){
		else {
			session.removeAttribute("loginU");
			session.invalidate();
			url="/home.jsp";
			
		}
		
		
		
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

}
