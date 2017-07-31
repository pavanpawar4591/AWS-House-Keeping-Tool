
package com.housekeepingtool.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.awshousekeeping.dao.AccountManagementDao;
import com.awshousekeeping.model.Account;
import com.awshousekeeping.services.AccountService;
import com.awshousekeeping.services.impl.AccountServiceImpl;
import com.awshousekeeping.utils.BusinessException;

public class TestAccountManagement {

	@Mock
	private AccountManagementDao accDao;

	@InjectMocks
	private AccountService accountService = new AccountServiceImpl();

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testAddAccount() throws BusinessException {

		when(accDao.addAccount(Mockito.any(Account.class))).thenReturn(true);
		Boolean result = accountService.addAccount(Mockito.any(Account.class));
		assertEquals(result, true);

	}

	@Test
	public void testListAllAccount() throws BusinessException {
		when(accDao.getAllAccount()).thenReturn(getDummyListAccount());

		List<Account> acclist = accountService.listAllAccounts();
		assertEquals(acclist.size(), 1);
	}

	private Account getDummyAccount() {
		Account acc = new Account();

		acc.setCreatedBy("Pavan");
		acc.setCreatedOn(new Date());

		acc.setUpdatedOn(new Date());
		acc.setUpdatedBy("Pavan");
		acc.setHspsId("uan");
		acc.setProjectExpireDate(new Date());
		acc.setFreeTrialExpireDate(new Date());
		acc.setAwsAccountOwnerName("Uday Nuli");
		acc.setHspsExpireDate(new Date());
		acc.setEmailIdOfOwner("uanuli@yahoo.com");
		acc.setProjectName("Embedded tools");
		acc.setProjectId("28101719");
		acc.setAccountType("Oregon");

		return acc;
	}

	private List<Account> getDummyListAccount() {
		List<Account> acclist = new ArrayList<>();
		acclist.add(getDummyAccount());
		return acclist;
	}

	void acc() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();

		List<Long> input = new ArrayList<>();
		input.add(a);
		input.add(b);

		Collections.sort(input);

	}
}