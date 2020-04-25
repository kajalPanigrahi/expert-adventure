package com.stackroute.spring.di;

public class MySQLDBConfig {
	
	private String dbDriver;
	private String dbURL;
	private String username;
	private String password;
	
	public MySQLDBConfig(String dbDriver, String dbURL, String username, String password) {
		
		this.dbDriver = dbDriver;
		this.dbURL = dbURL;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "MySQLDBConfig [dbDriver=" + dbDriver + ", dbURL=" + dbURL + ", username=" + username + ", password="
				+ password + "]";
	}
	
	
	
	

}
