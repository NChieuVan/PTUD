package dao.login;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JCheckBox;

import connectDB.JDBCuntil;
import gui.login.Login;
import model.TaiKhoan;

public class Login_Dao {
	
	
	public TaiKhoan getTaiKhoan(String tenTK, String mk) {
		JDBCuntil.getInstance();
		Connection con = JDBCuntil.getConnetion();

		TaiKhoan taiKhoan = null;
		try {
			String sql = "SELECT tenTaiKhoan, matKhau, vaiTro\r\n" + "FROM TaiKhoan\r\n" + "WHERE tenTaiKhoan = '"
					+ tenTK + "' AND matKhau = '" + mk + "';";

			Statement statement = con.createStatement();
			ResultSet rs =  statement.executeQuery(sql);

			while (rs.next()) {
				taiKhoan = new TaiKhoan(rs.getString("tenTaiKhoan"), rs.getString("matKhau"), rs.getString("vaiTro"));
			}
		} catch (SQLException e) {
			System.out.println("Xem lai trang Login_dao");
			e.printStackTrace();
		}
		return taiKhoan;

	}
}
