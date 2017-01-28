package com.awshousekeeping.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("test") && password.equals("test123"))
			return true;

		return false;
	}

}
