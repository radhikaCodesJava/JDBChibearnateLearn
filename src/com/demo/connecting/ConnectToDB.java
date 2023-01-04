package com.demo.connecting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//link and load the driver
		// establish a connection:
		String url = "jdbc:postgresql://localhost:5432/employee_management_system";
		String username = "postgres";
		String password = "mypostgres";
		String sqlQuery = "create table department(dept_id integer,dept_name varchar(20),dept_employee_id integer)";
		Connection C1 = null;
		Statement st1 = null;
		try {
			C1 = DriverManager.getConnection(url, username, password);

			// create a statement object
			st1 = C1.createStatement();

			// execute the statement and pass the query
			boolean result = st1.execute(sqlQuery);
			System.out.println("table created" + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (st1 != null)
					st1.close();
				if (C1 != null)
					C1.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
