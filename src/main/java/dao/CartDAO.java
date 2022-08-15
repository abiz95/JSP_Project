package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import config.ConnectionManager;

public class CartDAO {

	@SuppressWarnings("unused")
	public void getAll() {
//		Connection con;
		try (Connection con = ConnectionManager.initializeDatabase();
				PreparedStatement pstmt = con.prepareStatement("SELECT * FROM c4computer.book;");
				ResultSet rst = pstmt.executeQuery();) {
//        con = DriverManager.getConnection(JdbcURL, Username, password);
//			Connection con = ConnectionManager.initializeDatabase();
//			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM c4computer.book;");
//			ResultSet rst = pstmt.executeQuery();
			System.out.println("Id\t\tName\t\tAge\n");
			while (rst.next()) {
				System.out.print(rst.getInt(1));
				System.out.print("\t\t" + rst.getString(2).toString());
//				System.out.print("\t\t" + rst.getInt(3));
				System.out.println();
			}
		} catch (Exception exec) {
			exec.printStackTrace();
		}
	}

}
