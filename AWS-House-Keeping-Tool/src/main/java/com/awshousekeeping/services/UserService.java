package com.awshousekeeping.services;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.awshousekeeping.model.User;
import com.awshousekeeping.utils.BusinessException;

public interface UserService {
/**
 * This method return all users list
 * @return List<User>
 */
	public List<User> listAllUsers();
	
	
	public boolean addUser(HttpServletRequest req) throws  BusinessException;



	
}
