package com.awshousekeeping.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.awshousekeeping.services.AwsIamUserService;
import com.awshousekeeping.services.impl.AwsIamUserServiceImpl;

@WebServlet(urlPatterns = "/listawsIAM.do")
public class ListIAMUsersSeverlet extends HttpServlet {

	/**
	 * 
	 */
	public static final Logger LOGGER = Logger.getLogger(ListIAMUsersSeverlet.class);

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			AwsIamUserService uservice = new AwsIamUserServiceImpl();

			request.setAttribute("users", uservice.getAllIAMUSers(1).getUsers());
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			request.setAttribute("errorMessage", e.getMessage());

		}
		request.getRequestDispatcher("/WEB-INF/views/IAM-User-List.jsp").forward(request, response);
	}
}