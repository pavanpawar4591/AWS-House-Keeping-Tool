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
			
			
			
			
			account.setAccountId(Integer.parseInt(request.getParameter("accountId")));
			account.setProjectId(Integer.parseInt(request.getParameter("projectId")));
			account.setProjectName(request.getParameter("projectName"));
			account.setAwsAccountAlias(request.getParameter("awsAccountAlias"));
			account.setAwsAccountOwnerName(request.getParameter("awsAccountOwnerName"));
			account.setEmailIdOfOwner(request.getParameter("emailIdOfOwner"));
			account.setAccountType(request.getParameter("accountType"));
			account.setCreatedOn(new Date());
			account.setCreatedBy(request.getParameter("createdBy"));
			account.setUpdatedOn(new Date());
			account.setUpdatedBy(request.getParameter("updatedBy"));
			account.setHspsId(Integer.parseInt(request.getParameter("hspsId")));
			account.setHspsExpireDate(new Date());
			account.setProjectExpireDate(new Date());
			account.setFreeTrialExpireDate(new Date());
			account.setHspsDescription(request.getParameter("hspsDescription"));
			account.setBusinessUnit(Integer.parseInt(request.getParameter("businessUnit")));
			account.setAwsAccountNumber(Integer.parseInt(request.getParameter("awsAccountNumber")));
			account.setAwsAccessKey(Integer.parseInt(request.getParameter("awsAccessKey")));
			account.setAwsSecretKey(Integer.parseInt(request.getParameter("awsSecretKey")));
			account.setAwsAccessKeyXXXX(request.getParameter("awsAccessKeyXXXX"));
			account.setAwsSecretKeyXXXX(request.getParameter("awsSecretKeyXXXX"));
			
			

			
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
