package com.bridgelabz.addressbook;

import java.sql.*;

public class AdvancedAddressBook {
	public static void main(String[] args) throws Exception {
		// register driver
		String url = "jdbc:mysql://localhost:3306/AddressBookService";
		String userName = "root";
		String password = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");

		// System.out.println("Welcome to Address Book System!");
		// establish connection

		try (Connection con = DriverManager.getConnection(url, userName, password);
				Statement st = con.createStatement();) {
			// ResultSet rs = st.executeQuery("select * student");
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sql = "create table AddressBook(firstName varchar(255),lastName varchar(255),address varchar(255),city varchar(255),state varchar(255),zipCode int,PhoneNumber varchar(10) primary key,email varchar(255))";

			// execute the query
			st.executeUpdate(sql);
			System.out.println("table created successfully....");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
