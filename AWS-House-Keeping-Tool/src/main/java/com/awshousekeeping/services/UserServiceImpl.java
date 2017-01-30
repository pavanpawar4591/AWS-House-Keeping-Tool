package com.awshousekeeping.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.awshousekeeping.model.User;
import com.awshousekeeping.utils.DBConnect;

public class UserServiceImpl implements UserService {

	public List<User> listAllUsers() {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList();

		Connection con = DBConnect.getConnecttion();
		String sql = "select * from user";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				User user = new User();

				user.setFirstname(rs.getString("firstname"));
				users.add(user);

			}

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return users;
	}

}
