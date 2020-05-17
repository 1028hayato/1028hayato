package DB;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class register extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>データベーステスト</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("</body></html>");

		int id = Integer.parseInt(request.getParameter("ID"));

		String name = request.getParameter("NAME");

		Date birthday = Date.valueOf(request.getParameter("birthDay"));

		int age = Integer.parseInt(request.getParameter("AGE"));

		String driverName = "com.mysql.cj.jdbc.Driver";

		String jdbcURL = "jdbc:mysql://localhost:3306/task1";

		String userID = "1028HAYATO";

		String userPass = "1990hayato";

		Connection con = null;

        try {
			Class.forName(driverName);

			con = DriverManager.getConnection(jdbcURL, userID, userPass);

			String sql = "INSERT INTO employee (id, name, birthday, age) values (?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setDate(3, birthday);
			pstmt.setInt(4, age);
			pstmt.executeUpdate();

			pstmt.close();

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
