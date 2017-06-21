package com.awshousekeeping.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.awshousekeeping.services.AwsEBSResourceService;
import com.awshousekeeping.services.impl.AWSEBSResourceServiceImpl;

/**
 * 
 * 
 *
 */
@WebServlet(urlPatterns = "/listEbsVolumes.do")
public class ListEBSResourcesServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AwsEBSResourceService service = new AWSEBSResourceServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			request.setAttribute("ec2instances", service.getAllRegionsEBSVolume("0"));
		} catch (Exception e) {
			request.setAttribute("errorMessage", e.getMessage());

		}
		request.getRequestDispatcher("/WEB-INF/views/EBS-list.jsp").forward(request, response);
	}
}