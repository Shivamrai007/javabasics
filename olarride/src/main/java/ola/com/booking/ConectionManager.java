package ola.com.booking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConectionManager {

	public static Connection conn; 
	
	public static Connection getConnection() {
	String url = "jdbc:mysql://localhost:3306/bookmyrides";
	String username = "root";
	String password = "root";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;		
	}

}
