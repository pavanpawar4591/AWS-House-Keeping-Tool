package com.awshousekeeping.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * 
 * @author pavan_pawar
 *
 */
@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/landing-admin.do")
public class AdminLandingServlet extends HttpServlet {
	public static final Logger LOGGER = Logger.getLogger(AdminLandingServlet.class);

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LOGGER.debug("in   AdminLandingServlet");
		request.getRequestDispatcher("/WEB-INF/views/admin/landing-admin.jsp").forward(request, response);
	}
}