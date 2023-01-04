package com.demo.connecting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// establish a connection:
				String url = "jdbc:postgresql://localhost:5432/employee_management_system";
				String username = "postgres";
				String password = "mypostgres";
				String sqlQuery = "insert into department values(1,'Billing',3)";
				Connection C1 = null;
				Statement st1 = null;
				try {
					C1 = DriverManager.getConnection(url, username, password);

					// create a statement object
					st1 = C1.createStatement();

					// execute the statement and pass the query
					boolean result = st1.execute(sqlQuery);
					System.out.println("inserted " + result);
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


