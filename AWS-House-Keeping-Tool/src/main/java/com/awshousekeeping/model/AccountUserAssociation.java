package com.awshousekeeping.model;

public class AccountUserAssociation {
	
	private int budget_id;
	private String budget_start_date;
	private String budget_end_date;
	private double budget_amount;
	private String budget_description;
	private String budget_conditional_operator;
	
	
	public int getBudget_id() {
		return budget_id;
	}
	public void setBudget_id(int budget_id) {
		this.budget_id = budget_id;
	}
	public String getBudget_start_date() {
		return budget_start_date;
	}
	public void setBudget_start_date(String budget_start_date) {
		this.budget_start_date = budget_start_date;
	}
	public String getBudget_end_date() {
		return budget_end_date;
	}
	public void setBudget_end_date(String budget_end_date) {
		this.budget_end_date = budget_end_date;
	}
	public double getBudget_amount() {
		return budget_amount;
	}
	public void setBudget_amount(double budget_amount) {
		this.budget_amount = budget_amount;
	}
	public String getBudget_description() {
		return budget_description;
	}
	public void setBudget_description(String budget_description) {
		this.budget_description = budget_description;
	}
	public String getBudget_conditional_operator() {
		return budget_conditional_operator;
	}
	public void setBudget_conditional_operator(String budget_conditional_operator) {
		this.budget_conditional_operator = budget_conditional_operator;
	}
	


}
