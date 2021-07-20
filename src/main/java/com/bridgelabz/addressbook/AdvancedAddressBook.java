package com.bridgelabz.addressbook;

import java.sql.*;

public class AdvancedAddressBook {
	public static void main(String[] args) throws Exception {
		// register driver
		String url = "jdbc:mysql://localhost:3306/AddressBookService";
		String userName = "root";
		String password = "root";
		

		// System.out.println("Welcome to Address Book System!");
		// establish connection
		try (Connection con = DriverManager.getConnection(url, userName, password);
				Statement st = con.createStatement();) {
			// ResultSet rs = st.executeQuery("select * student");
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sql = "INSERT INTO AddressBook VALUES ('pooja','roy','mumbai','mumbai','MH',323,'9898989800','p@gmail.com')";
			
			// execute the query
			st.executeUpdate(sql);
			System.out.println("records inserted successfully....");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
