package com.awshousekeeping.dao;

import java.util.List;

import com.awshousekeeping.model.Account;
<<<<<<< HEAD
import com.awshousekeeping.model.User;
import com.awshousekeeping.utils.BusinessException;

public interface AccountDao {
	
	public boolean addAccount(Account a) throws BusinessException;
	
	public boolean saveAccount(Account a) throws BusinessException; 
	
	public boolean deleteAccount(int accountId) throws BusinessException;
	
	public boolean updateAccount(Account a) throws BusinessException;
	
	public List<Account> getAllAccount() throws BusinessException; 
=======

public interface AccountDao {
	public List<Account> getAllAccount();
	
	public boolean addAccount(Account a);
>>>>>>> 97a96aebfc53b597482665910f1e73a390d11c3f
}
