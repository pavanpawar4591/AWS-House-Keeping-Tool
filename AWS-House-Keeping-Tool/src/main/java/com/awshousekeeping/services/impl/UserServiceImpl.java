package com.awshousekeeping.services.impl;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.awshousekeeping.dao.UserManagementDao;
import com.awshousekeeping.dao.impl.UserManagementDaoImpl;
import com.awshousekeeping.model.User;
import com.awshousekeeping.services.UserService;
import com.awshousekeeping.utils.BusinessException;

public class UserServiceImpl implements UserService {

	private UserManagementDao userManagementDao = new UserManagementDaoImpl();

	@Override
	public List<User> listAllUsers() {

		return userManagementDao.getAllUser();
	}

	@Override
	public boolean addUser(HttpServletRequest request) throws BusinessException {

		User user = new User();
		// String newTodo = request.getParameter("todo");
		user.setCreatedBy(" ");
		user.setUpdatedBy("");
		user.setCreateOn(new Date());
		user.setUpdatedOn(new Date());
		user.setEmail("");
		user.setPassword("");
		user.setIsActive(1);
		user.setUserName( request.getParameter("userName"));
		
		user.setRole(1);
		
		userManagementDao.addUser(user);
		
		return true;
	}

}
