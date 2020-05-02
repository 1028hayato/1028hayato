package practice;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Task4 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         response.setContentType("text/html; charset=UTF-8");
		 Date today = new Date();
		 String[] fortunes = {"大吉", "中吉", "小吉", "末吉", "凶", "大凶"};
		 Random random = new Random();
		 String fortune = fortunes[random.nextInt(6)];

		 FortuneBean fortunebean = new FortuneBean();
		 fortunebean.setToday(today);
		 fortunebean.setFortune(fortune);
		 request.setAttribute("占う", fortunebean);

		 request.getRequestDispatcher("/fortune_result.jsp").forward(request, response);
	}
}