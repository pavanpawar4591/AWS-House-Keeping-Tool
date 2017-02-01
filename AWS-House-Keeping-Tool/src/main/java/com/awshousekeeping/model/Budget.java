package com.awshousekeeping.model;

import java.sql.Timestamp;

public class Budget {

	private int budgetId;
	private Timestamp budgetStartDate;
	private Timestamp budgetEndDate;
	private double budgetAmount;
	private String budgetDescription;
	private String budgetConditionalOperator;
	private int accountId;

	public int getBudgetId() {
		return budgetId;
	}

	public void setBudgetId(int budgetId) {
		this.budgetId = budgetId;
	}

	public Timestamp getBudgetStartDate() {
		return budgetStartDate;
	}

	public void setBudgetStartDate(Timestamp budgetStartDate) {
		this.budgetStartDate = budgetStartDate;
	}

	public Timestamp getBudgetEndDate() {
		return budgetEndDate;
	}

	public void setBudgetEndDate(Timestamp budgetEndDate) {
		this.budgetEndDate = budgetEndDate;
	}

	public double getBudgetAmount() {
		return budgetAmount;
	}

	public void setBudgetAmount(double budgetAmount) {
		this.budgetAmount = budgetAmount;
	}

	public String getBudgetDescription() {
		return budgetDescription;
	}

	public void setBudgetDescription(String budgetDescription) {
		this.budgetDescription = budgetDescription;
	}

	public String getBudgetConditionalOperator() {
		return budgetConditionalOperator;
	}

	public void setBudgetConditionalOperator(String budgetConditionalOperator) {
		this.budgetConditionalOperator = budgetConditionalOperator;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

}
