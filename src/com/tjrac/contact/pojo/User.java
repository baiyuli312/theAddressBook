package com.tjrac.contact.pojo;

public class User {
	private String userAccount;
	private String userPassword;
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "User [userAccount=" + userAccount + ", userPassword=" + userPassword + "]";
	}
	
}
