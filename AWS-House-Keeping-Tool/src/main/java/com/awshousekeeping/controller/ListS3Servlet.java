package com.awshousekeeping.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.awshousekeeping.services.AwsS3ListService;
import com.awshousekeeping.services.impl.AwsS3ListServiceImpl;

/**
 * 
 * @author pavan_pawar
 *
 */
@WebServlet(urlPatterns = "/listawss3.do")
public class ListS3Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public static final Logger LOGGER = Logger.getLogger(ListS3Servlet.class);

	/**
	 * @param request
	 * @param response
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			AwsS3ListService awsS3ListService = new AwsS3ListServiceImpl();

			request.setAttribute("s3Buckets", awsS3ListService.listAWSs3Buckets(0));
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			request.setAttribute("errorMessage", e.getMessage());

		}
		request.getRequestDispatcher("/WEB-INF/views/s3-List.jsp").forward(request, response);
	}

}