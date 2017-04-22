package com.awshousekeeping.model;
/**
 * 
 * @author pavan_pawar
 *
 */
public class Role {

	private int role;
	private String roleName;
	private int active;

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

}