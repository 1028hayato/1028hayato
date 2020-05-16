package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

	public static void main(String[] args) throws Exception {
		String driverName = "com.mysql.cj.jdbc.Driver";

		String jdbcURL ="jdbc:mysql://localhost:3306/task1";

		String userID ="1028HAYATO";

		String userPass ="1990hayato";

		Connection con = null;

		try {

			Class.forName(driverName);

			con = DriverManager.getConnection(jdbcURL, userID, userPass);

			System.out.println("DB接続が成功しました。");

		}catch (ClassNotFoundException e){
			e.printStackTrace();

		}catch (SQLException e){
			e.printStackTrace();

		}catch (Exception e) {
			e.printStackTrace();

		}finally{
			try {
				if(con != null) {
					con.close();
				}
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
}