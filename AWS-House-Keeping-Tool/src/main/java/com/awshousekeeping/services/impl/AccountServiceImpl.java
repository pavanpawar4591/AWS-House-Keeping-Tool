package com.awshousekeeping.services.impl;

import java.util.List;

import com.awshousekeeping.dao.AccountDao;
import com.awshousekeeping.dao.impl.AccountDaoImpl;
import com.awshousekeeping.model.Account;
import com.awshousekeeping.services.AccountService;
import com.awshousekeeping.utils.BusinessException;

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao = new AccountDaoImpl();

	public List<Account> getAllAccount() throws BusinessException {

		return accountDao.getAllAccount();
	}

	@Override
	public boolean addNewAWSAccount(Account a) throws BusinessException {

		// TODO access key secret key ecrypt using aes 256
		// TODO 20 input string 16 xx last four visible
		// TODO call dao accountService
		return accountDao.addAccount(a);
	}

}
