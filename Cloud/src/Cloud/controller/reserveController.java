package Cloud.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Cloud.data.reserveDAO;
import Cloud.model.reserve;
import Cloud.model.user;

/**
 * Servlet implementation class reserveController
 */
@WebServlet("/reserveController")
public class reserveController extends HttpServlet {
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
		reserve reserve=new reserve();
		if(action.equalsIgnoreCase("reserveclass")) {
			user loginU=(user) session.getAttribute("loginU");
			int id=loginU.getId_user();
			int createid=Integer.parseInt(request.getParameter("id"));
			reserve.setId_user(id);
			reserve.setIdcreate(createid);
			reserveDAO.createreserve(reserve);
			url="/courseController?action=studentupcominglist";
		}
		else if(action.equalsIgnoreCase("deletereservation")) {
			user loginU=(user) session.getAttribute("loginU");
			int id=loginU.getId_user();
			int createid=Integer.parseInt(request.getParameter("id"));
			reserve.setId_user(id);
			reserve.setIdcreate(createid);
			reserveDAO.deletereserve(reserve);
			url="/courseController?action=studentupcominglist";
			
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

}
