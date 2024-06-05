package com.entity;

public class User {
	private Integer userId;
	private String userName;
	private String password;
	private Integer userType;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String password ) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	public User(String userName, String password, Integer userType) {
		super();
		this.userName = userName;
		this.password = password;
		this.userType = userType;
	}
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getUserType() {
		return userType;
	}
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
}
