package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBUtil {
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/imooc";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	
	private static Connection conn;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
 		
	}
	
	public static Connection getConnection() {
		return conn;
	}
	
	
}
