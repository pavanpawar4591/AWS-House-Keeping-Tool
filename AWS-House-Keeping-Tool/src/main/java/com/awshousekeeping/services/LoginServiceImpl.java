package com.awshousekeeping.services;

import org.apache.log4j.Logger;

public class LoginServiceImpl implements LoginService {

	static final Logger logger = Logger.getLogger(LoginServiceImpl.class);

	public boolean isUserValid(String user, String password) {
		// TODO check password form data base

		logger.info("---inside LoginServiceImpl---");

		if (user.equals("test") && password.equals("test123"))
			return true;

		return false;
	}

}
