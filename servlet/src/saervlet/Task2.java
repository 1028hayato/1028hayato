package saervlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Task2")
public class Task2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd");

		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=UTF-8>");
		out.println("<title>ServletTask</title>");
		out.println("</head>");
		out.println("<body>");
		out.print("<h1>今日の日付:" + sdf.format(today) +"</h1>");
		out.println("</body></html>");
	}
}