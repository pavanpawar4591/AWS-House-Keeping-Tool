package com.awshousekeeping.services;

import java.util.List;

import com.awshousekeeping.model.Account;
import com.awshousekeeping.utils.BusinessException;

/**
 * 
 * @author pavan_pawar
 *
 */
public interface AccountService {
	/**
	 * This method used for listing all AWS accounts
	 * 
	 * @return all account list
	 */
	public List<Account> listAllAccounts();

	
	/**
	 * Creating new account
	 * @param account
	 * @return
	 * @throws BusinessException
	 */
	public boolean addAccount(Account account) throws BusinessException;

}