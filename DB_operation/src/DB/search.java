package DB;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/search")
public class search extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        String driverName = "com.mysql.cj.jdbc.Driver";

        String jdbcURL = "jdbc:mysql://localhost:3306/task1";

        String userID = "1028HAYATO";

        String userPass = "1990hayato";

        String name = request.getParameter("NAME");

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName(driverName);

            con = DriverManager.getConnection(jdbcURL, userID, userPass);

            String sql = "SELECT * from employee where name like ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "%" + name + "%");

            rs = pstmt.executeQuery();

            PrintWriter out = response.getWriter();

            out.println("<html>");
            out.println("<head>");
            out.println("<title>データベーステスト</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<p>検索結果</p>");

            while (rs.next()) {
                out.println("<p>ID:" + rs.getInt("id") + "</p>");
                out.println("<p>名前:" + rs.getString("name") + "</p>");
                out.println("<p>生年月日:" + rs.getDate("birthday") + "</p>");
            }

            rs.close();
            pstmt.close();
            out.println("</body></html>");

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