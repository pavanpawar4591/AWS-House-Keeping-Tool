package com.awshousekeeping.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.awshousekeeping.model.Account;
import com.awshousekeeping.services.AccountService;
import com.awshousekeeping.services.impl.AccountServiceImpl;
import com.awshousekeeping.utils.BusinessException;

@WebServlet(urlPatterns = "/addAWSAccount.do")
public class AddAccountServlet extends HttpServlet {
private AccountService as = new AccountServiceImpl();
	 

	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/AddAccount.jsp").forward(
				request, response);
	}

	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {
				
			Account a = new Account(); 
			as.addNewAWSAccount(a);
			

			if (true) {
				response.sendRedirect("Account-List.do");
			} else {
				request.setAttribute("errorMessage", "Error while Adding account");
				request.getRequestDispatcher("/WEB-INF/views/AddAccount.jsp")
						.forward(request, response);
			}
		} catch (BusinessException e) {
			request.setAttribute("errorMessage", e.getCause());
			request.getRequestDispatcher("/WEB-INF/views/AddAccount.jsp")
					.forward(request, response);

		}

	}

}
