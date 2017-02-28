package com.awshousekeeping.dao;

import java.util.List;

import com.awshousekeeping.model.Account;

public interface AccountDao {
	public List<Account> getAllAccount();
	
	public boolean addAccount(Account a);
}
