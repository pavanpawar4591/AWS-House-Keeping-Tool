package com.awshousekeeping.services;

import com.awshousekeeping.model.Account;
import com.awshousekeeping.utils.BusinessException;

public interface AccountService {
	
	public boolean addNewAWSAccount(Account a) throws BusinessException;

}
