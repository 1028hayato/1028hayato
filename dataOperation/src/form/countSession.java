package form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/countSession")
public class countSession extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession(false);

		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=UTF-8>");
		out.println("<title>Session</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>訪問回数テスト(セッション)</h1>");

		if(session == null) {
			out.println("<p>初めての訪問です</P>");
			session = request.getSession(true);
			session.setAttribute("visited", "1");

		}else{
			String visitedstr =(String) session.getAttribute("visited");
			int visited = Integer.parseInt(visitedstr);
			visited++;

			out.println("<p>");
			out.println(visited);
			out.println("回目の訪問です。</p>");

			session.setAttribute("visited", Integer.toString(visited));

		}
		out.println("<a href=\"countSession\">画面を再訪問</a>");

		out.println("</body></html>");

	}
}
