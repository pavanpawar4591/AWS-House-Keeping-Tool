package com.awshousekeeping.services.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.awshousekeeping.services.LoginService;
import com.awshousekeeping.utils.DBConnect;
import com.mysql.jdbc.PreparedStatement;

public class LoginServiceImpl implements LoginService {

	static final Logger logger = Logger.getLogger(LoginServiceImpl.class);

	public boolean isUserValid(String user, String password) {

		logger.debug("---inside LoginServiceImpl---");

		Connection con = DBConnect.getConnecttion();
		String sql = "select * from user where user_name='" + user
				+ "' and password='" + password + "'";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				con.close();
				return true;
			}

		} catch (SQLException e) {
			logger.error("Error At Login service ", e);

			try {

				con.close();
			} catch (SQLException e1) {
				logger.error("Error while closing connection ", e1);
			}

		}

		return false;
	}

}
