package com.hp.qa.util;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class DbUtils {

	private String hostName = "dev-aurora.cluster-cyiztj2trvw7.us-east-1.rds.amazonaws.com";
	private String port = ":3306";
	private String dbName = "/WCC_QA_AUTOMATION";
	private String sslCert = "?autoReconnect=true&useSSL=false";
	private String userName = "QA_ADMIN";
	private String password = "QA_Automation#123";
	private String connectionURL = "jdbc:mysql://" + hostName + port + dbName + sslCert;
	private Statement stmt;
	private Connection con;
	private String formattedDate;
	
	private void getConnectionStatement() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(connectionURL, this.userName, this.password);
			stmt = con.createStatement();			
		} catch (Exception e) {
			System.out.println(e);			
		}
	}

	public String localDateTime() {
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before formatting: " + myDateObj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		formattedDate = myDateObj.format(myFormatObj);
		System.out.println("After formatting: " + formattedDate);
		return formattedDate;
	}

	public String get_Tab_Title(String rowID) {
		String str = "";
		try {	
			getConnectionStatement();
			ResultSet rs = stmt
					.executeQuery("select Page_Tab_Title from WCC_QA_AUTOMATION.page_tabtitle where row_id ='"
							+ rowID + "'");
			while (rs.next())
				str = str + rs.getString(1);
			con.close();
			return str;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public String get_Serial_Number(String rowID) {
		String str = "";
		try {
			getConnectionStatement();
			ResultSet rs = stmt
					.executeQuery("select Serial_Number from WCC_QA_AUTOMATION.product_details where row_id ='"
							+ rowID + "'");
			while (rs.next())
				str = str + rs.getString(1);
			con.close();
			return str;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public String get_username(String rowID) {
		String str = "";
		try {
			getConnectionStatement();
			ResultSet rs = stmt
					.executeQuery("select username from WCC_QA_AUTOMATION.user_credential where row_id ='"
							+ rowID + "'");
			while (rs.next())
				str = str + rs.getString(1);
			con.close();
			return str;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public String get_password(String rowID) {
		String str = "";
		try {
			getConnectionStatement();
			ResultSet rs = stmt
					.executeQuery("select password from WCC_QA_AUTOMATION.user_credential where row_id ='"
							+ rowID + "'");
			while (rs.next())
				str = str + rs.getString(1);
			con.close();
			return str;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}	
	
	public String get_Product_Number(String rowID) {
		String str = "";
		try {
			getConnectionStatement();
			ResultSet rs = stmt
					.executeQuery("select Product_Number from WCC_QA_AUTOMATION.product_details where row_id ='"
							+ rowID + "'");
			while (rs.next())
				str = str + rs.getString(1);
			con.close();
			return str;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public String get_Product_Name(String rowID) {
		String str = "";
		try {
			getConnectionStatement();
			ResultSet rs = stmt
					.executeQuery("select Product_Name from WCC_QA_AUTOMATION.product_details where row_id ='"
							+ rowID + "'");
			while (rs.next())
				str = str + rs.getString(1);
			con.close();
			return str;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public String get_Product_Series_Name(String rowID) {
		String str = "";
		try {
			getConnectionStatement();
			ResultSet rs = stmt
					.executeQuery("select Series_Name from WCC_QA_AUTOMATION.product_details where row_id ='"
							+ rowID + "'");
			while (rs.next())
				str = str + rs.getString(1);
			con.close();
			return str;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}	
	
	public String failScenarioInDB(String tcNo, String templateName, String browserName,String url) {
		String str = "";
		try {
			getConnectionStatement();
			stmt.executeUpdate("update WCC_QA_AUTOMATION.test_execution set test_status ='FAIL', template_name='"+templateName+"', browser='"+browserName+"', execution_date='"+localDateTime()+"', environment='"+url+"' where testcase_id ='"
					+ tcNo + "'");
			con.close();
			return str;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public String passScenarioInDB(String tcNo, String templateName, String browserName,String url) {
		String str = "";
		try {
			getConnectionStatement();
			stmt.executeUpdate("update WCC_QA_AUTOMATION.test_execution set test_status ='PASS', template_name='"+templateName+"', browser='"+browserName+"', execution_date='"+localDateTime()+"', environment='"+url+"' where testcase_id ='"
					+ tcNo + "'");
			con.close();
			return str;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

}
