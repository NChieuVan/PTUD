package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCuntil {
	public static JDBCuntil instance = new JDBCuntil();
	public static JDBCuntil getInstance() {
		return instance;
	}
	public static Connection getConnetion() {
		Connection c = null;
		try {
			DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
			String url = "jdbc:sqlserver://localhost:1433;databaseName = QuanLyHieuThuocTay";
			String user = "sa";
			String password = "sapassword";
			c = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
}
//	public static void closeConnection(Connection c) {
//		try {
//			if (c!=null) {
//				c.close();
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
}
