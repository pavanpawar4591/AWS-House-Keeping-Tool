package com.awshousekeeping.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.awshousekeeping.model.Budget;
import com.awshousekeeping.services.BudgetService;
import com.awshousekeeping.services.impl.BudgetServiceImpl;
import com.awshousekeeping.utils.BusinessException;

/**
 * 
 * @author pavan_pawar
 *
 */
@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/add-budget.do")
public class AddBudgetServlet extends HttpServlet {

	public static final Logger LOGGER = Logger.getLogger(AddBudgetServlet.class);

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/add-budget.jsp").forward(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		BudgetService budgetService = new BudgetServiceImpl();

		try {

			Budget budget = new Budget();

			budget.setBudgetId(Integer.parseInt(request.getParameter("budgetId")));
			budget.setBudgetStartDate(new Date());
			budget.setBudgetEndDate(new Date());
			budget.setBudgetAmount(Double.parseDouble(request.getParameter("budgetAmount")));
			budget.setBudgetDescription(request.getParameter("budgetDescription"));
			budget.setBudgetConditionalOperator(request.getParameter("budgetConditionalOperator"));
			budget.setAccountId(Integer.parseInt(request.getParameter("accountId")));

			boolean success = budgetService.addBudget(budget);

			if (success) {
				response.sendRedirect("Budget-List.do");
			} else {
				request.setAttribute("errorMessage", "Error while Adding budget");
				request.getRequestDispatcher("/WEB-INF/views/add-budget.jsp").forward(request, response);
			}
		} catch (BusinessException e) {
			LOGGER.error(e.getMessage(), e);
			request.setAttribute("errorMessage", e.getCause());
			request.getRequestDispatcher("/WEB-INF/views/add-budget.jsp").forward(request, response);

		}

	}

}