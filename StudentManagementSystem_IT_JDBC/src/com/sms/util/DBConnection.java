package com.sms.util;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SqlException;
public class DBConnection {
private static final String URL = "jdbc:mysql://localhost:3306/sms";
private static final String USER = "root";
private static final String PASSWORD = "Kgisl@123";
public static Connection getConnection() throws sqlException {
	return Driver.class.getConnection (URL,USER,PASSWORD);
}
}
