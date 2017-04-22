package com.awshousekeeping.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.awshousekeeping.model.Todo;
import com.awshousekeeping.services.impl.TodoServiceImpl;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/delete-user.do")
public class DeleteTodoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TodoServiceImpl todoService = new TodoServiceImpl();

		todoService.deleteTodo(new Todo(request.getParameter("todo"), request.getParameter("category")));
		response.sendRedirect("delete-user.do");
	}
}