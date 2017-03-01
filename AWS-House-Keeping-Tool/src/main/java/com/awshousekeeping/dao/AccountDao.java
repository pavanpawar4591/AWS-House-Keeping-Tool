package com.awshousekeeping.dao;

import java.util.List;

import com.awshousekeeping.model.Account;
import com.awshousekeeping.model.User;
import com.awshousekeeping.utils.BusinessException;

public interface AccountDao {
	
	public boolean addAccount(Account a) throws BusinessException;
	
	public boolean saveAccount(Account a) throws BusinessException; 
	
	public boolean deleteAccount(int accountId) throws BusinessException;
	
	public boolean updateAccount(Account a) throws BusinessException;
	
	public List<Account> getAllAccount() throws BusinessException; 
}
