package com.awshousekeeping.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.awshousekeeping.services.UserService;
import com.awshousekeeping.services.impl.UserServiceImpl;
import com.awshousekeeping.utils.BusinessException;

@WebServlet(urlPatterns = "/add-user.do")
public class AddUserServlet extends HttpServlet {

	private UserService userService = new UserServiceImpl();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/add-user.jsp").forward(
				request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {
			boolean success = userService.addUser(request);

			if (success) {
				response.sendRedirect("User-List.do");
			} else {
				request.setAttribute("errorMessage", "Error while Adding user");
				request.getRequestDispatcher("/WEB-INF/views/add-user.jsp").forward(
						request, response);			
			}
		} catch (BusinessException e) {
			request.setAttribute("errorMessage", e.getCause());
			request.getRequestDispatcher("/WEB-INF/views/add-user.jsp").forward(
					request, response);
		
		}

	}

}
