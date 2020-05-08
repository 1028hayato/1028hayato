package form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Result")
public class Result extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("NAME");
        String gender = request.getParameter("GENDER");
        String question = request.getParameter("QTyoe");
        String area = request.getParameter("comment");

        if (gender == null) {
        	gender = "";
        }else if(gender.equals("1")) {
        	gender = "男性";
        }else if(gender.equals("2")) {
        	gender = "女性";
        }
        if(question.equals("a")) {
        	question = "製品について";
        }else if(question.equals("b")) {
        	question = "不具合やクレーム";
        }else if(question.equals("c")){
        	question = "アフターサポート";
        }


		PrintWriter out = response.getWriter();

        out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=UTF-8>");
		out.println("<title>受信画面</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>以下の内容でお問い合わせしました。回答をお待ちください。</p>");
		out.println("<p>名前:" + name + "様</p>");
		out.println("<p>性別:" + gender + "</p>");
		out.println("<p>お問い合わせ種類:" + question + "</p>");
		out.println("<p>お問い合わせ内容:" + area + "</p>");
		out.println("</body></html>");

	}

}
