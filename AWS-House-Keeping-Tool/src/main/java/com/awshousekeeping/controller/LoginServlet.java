package com.awshousekeeping.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.awshousekeeping.services.impl.LoginServiceImpl;
import com.awshousekeeping.utils.BusinessException;

/**
 * 
 * @author pavan_pawar
 *
 */
@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	public static final Logger LOGGER = Logger.getLogger(LoginServlet.class);

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LoginServiceImpl userValidationService = new LoginServiceImpl();

		String name = request.getParameter("name");
		String password = request.getParameter("password");

		int role;
		try {
			role = userValidationService.isUserValid(name, password);
			if (role == 1) {
				request.getSession().setAttribute("name", name);
				response.sendRedirect("list-todos.do");

			} else if (role == 2) {
				request.getSession().setAttribute("name", name);
				response.sendRedirect("landing-admin.do");

			} else {
				request.setAttribute("errorMessage", "Invalid Credentials!");
				request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
			}
		} catch (BusinessException e) {
			LOGGER.error(e.getMessage(), e);
			request.setAttribute("errorMessage", e.getCause());
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

		}

	}

}