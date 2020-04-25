package com.stackroute.spring.di;

public class MySQLConnection {
	
	private MySQLDBConfig mySQLDBConfig;
	private Course course1;

	
	/*
	 * public MySQLConnection(MySQLDBConfig mySQLDBConfig) { super();
	 * System.out.println("MySQLConnection(MySQLDBConfig)"); this.mySQLDBConfig =
	 * mySQLDBConfig; }
	 */
	
	  public MySQLConnection() { System.out.println("MySQLConnection"); }
	  public MySQLConnection(Course course1) {
		   this.course1 = course1;
	  }
	   
	     public MySQLConnection(MySQLDBConfig mySQLDBConfig) {
		super();
		System.out.println("MySQLConnection(MySQLDBConfig)");
		this.mySQLDBConfig = mySQLDBConfig;
	}

   
	
	public MySQLConnection(MySQLDBConfig mySQLDBConfig, Course course1) {
		System.out.println("MySQLConnection(MySQLDBConfig,Course)");
	this.mySQLDBConfig = mySQLDBConfig;
	this.course1 = course1;
}

	public MySQLDBConfig getMySQLDBConfig() {
		return mySQLDBConfig;
	}





	public void setMySQLDBConfig(MySQLDBConfig mySQLDBConfig) {
		this.mySQLDBConfig = mySQLDBConfig;
	}





	@Override
	public String toString() {
		return "MySQLConnection [mySQLDBConfig=" + mySQLDBConfig + ", course1=" + course1 + "]";
	}
	
	

}
