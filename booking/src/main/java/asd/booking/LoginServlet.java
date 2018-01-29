/**
 * 
 */
package asd.booking;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import asd.booking.dao.UserDAO;
import asd.booking.domain.UserBean;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6645193318867169686L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {

		try {

			UserBean user = new UserBean();
			user.setUserName(request.getParameter("un"));
			user.setPassword(request.getParameter("pw"));

			user = UserDAO.login(user);

			if (user.isValid()) {

				HttpSession session = request.getSession(true);
				session.setAttribute("currentSessionUser", user);
				response.sendRedirect("userLogged.jsp"); // logged-in page
			}

			else
				response.sendRedirect("invalidLogin.jsp"); // error page
		}

		catch (Throwable theException) {
			System.out.println(theException);
		}
	}
}	
