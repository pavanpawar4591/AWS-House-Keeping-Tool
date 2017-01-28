package com.awshousekeeping.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("test") && password.equals("test"))
			return true;

		return false;
	}

}
