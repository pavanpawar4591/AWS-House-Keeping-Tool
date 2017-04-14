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

import com.awshousekeeping.dao.BudgetManagementDao;
import com.awshousekeeping.model.Budget;
import com.awshousekeeping.services.BudgetService;
import com.awshousekeeping.services.impl.BudgetServiceImpl;
import com.awshousekeeping.utils.BusinessException;

public class TestBudget {

	@Mock
	private BudgetManagementDao budgetDao;

	@InjectMocks
	private BudgetService budgetService = new BudgetServiceImpl();

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testAddBudget() throws BusinessException {

		when(budgetDao.addBudget(Mockito.any(Budget.class))).thenReturn(true);
		Boolean result = budgetService.addBudget(Mockito.any(Budget.class));
		assertEquals(result, true);

	}

	@Test
	public void testListAllBudget() throws BusinessException {
		when(budgetDao.getAllBudget()).thenReturn(getDummyListBudget());

		List<Budget> budgetlist = budgetService.listAllBudgets();
		assertEquals(budgetlist.size(), 1);
	}

	private Budget getDummyBudget() {
		Budget bgt = new Budget();

		bgt.setBudgetStartDate(new Date());
		bgt.setBudgetEndDate(new Date());
		bgt.setBudgetAmount(6);
		bgt.setBudgetDescription("Cost management");
		bgt.setBudgetConditionalOperator("Pavan");
		bgt.setAccountId(1);
		return bgt;

	}

	private List<Budget> getDummyListBudget() {
		List<Budget> budgetlist = new ArrayList<>();
		budgetlist.add(getDummyBudget());
		return budgetlist;
	}

	void a() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		long d = in.nextLong();
		long e = in.nextLong();
	
		long sum = a + b + c + d + e;
		List<Long> input = new ArrayList<>();
		input.add(a);
		input.add(b);
		input.add(c);
		input.add(d);
		input.add(e);

		Collections.sort(input);
		System.out.println((sum - input.get(0)) + " " + (sum - input.get(4)));

	}
}