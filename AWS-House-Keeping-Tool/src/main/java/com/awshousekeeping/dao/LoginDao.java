package com.awshousekeeping.dao;

public interface LoginDao {

	/**
	 * 
	 * @param userName
	 * @param password
	 * @return
	 */
	public boolean checkLogin(String userName, String password);
	
}
