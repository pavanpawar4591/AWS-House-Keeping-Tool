package com.awshousekeeping.services.impl;

import org.apache.log4j.Logger;

import com.awshousekeeping.dao.LoginDao;
import com.awshousekeeping.dao.impl.LoginDaoImpl;
import com.awshousekeeping.services.LoginService;
import com.awshousekeeping.utils.BusinessException;

/**
 * 
 * @author pavan_pawar
 *
 */
public class LoginServiceImpl implements LoginService {

	private LoginDao loginDao = new LoginDaoImpl();
	static final Logger logger = Logger.getLogger(LoginServiceImpl.class);

	@Override
	public int isUserValid(String user, String password) throws BusinessException {

		if (loginDao.checkLogin(user, password)) {

			return loginDao.getRoleByUsername(user);

		}

		return 0;
	}

}