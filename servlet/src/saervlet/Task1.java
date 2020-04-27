package saervlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Task1")
public class Task1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html; charset=UTF-8");
		 PrintWriter out = response.getWriter();

		    out.println("<html>");
		    out.println("<head>");
		    out.println("<meta charset=UTF-8>");
		    out.println("<title>ServletTask</title>");
		    out.println("</head>");
		    out.println("<body>");
		    out.println("<h1>Hello World</h1>");
		    out.println("<p>初めてのサーブレット</p>");
		    out.println("</body></html>");
	}
}