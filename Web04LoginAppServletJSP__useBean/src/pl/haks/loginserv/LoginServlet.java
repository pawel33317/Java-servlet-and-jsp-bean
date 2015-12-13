package pl.haks.loginserv;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.haks.loginserv.dto.User;
import pl.haks.loginserv.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userId, password;

		userId = request.getParameter("userId");
		password = request.getParameter("password");

		LoginService loginService = new LoginService();
		boolean result = loginService.authenticate(userId, password);
		
		if (result) {
			User user = loginService.getUserDetails(userId);
			
			//request.getSession().setAttribute("user", user);
			//response.sendRedirect("success.jsp");
			
			//dispatcher zamiast przekierowania po udanym logownaiu
			//teraz ¿eby plik success mia³ dostêp do nazwy usera nie trzeba jej zapisywaæ w sesji
			request.setAttribute("user", user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response);
			return;
		}
		else {
			response.sendRedirect("login.jsp");
			return;
		}
	}

}
