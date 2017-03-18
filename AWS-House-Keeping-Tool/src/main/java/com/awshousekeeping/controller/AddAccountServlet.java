package com.awshousekeeping.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.awshousekeeping.model.Account;
import com.awshousekeeping.services.AccountService;
import com.awshousekeeping.services.impl.AccountServiceImpl;
import com.awshousekeeping.utils.BusinessException;


@WebServlet(urlPatterns = "/add-account.do")

public class AddAccountServlet extends HttpServlet {

	private AccountService accountService = new AccountServiceImpl();

	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/add-account.jsp").forward(
				request, response);
	}

	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {

			Account account = new Account();
			// String newTodo = request.getParameter("todo");
			
			account.setProjectName(request.getParameter("projectName"));
			account.setAwsAccountAlias(request.getParameter("awsAccountAlias"));
			account.setAccountType(request.getParameter("accountType"));
			
			//TODO continue Complte all fields................................................
			
			boolean success = accountService.addAccount(account);

			if (success) {
				response.sendRedirect("Account-List.do");
			} else {
				request.setAttribute("errorMessage", "Error while Adding account");
				request.getRequestDispatcher("/WEB-INF/views/add-account.jsp")
						.forward(request, response);
			}
		} catch (BusinessException e) {
			request.setAttribute("errorMessage", e.getCause());
			request.getRequestDispatcher("/WEB-INF/views/add-account.jsp")
					.forward(request, response);

		}

	}

}
