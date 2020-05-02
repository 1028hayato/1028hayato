<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="practice.FortuneBean" %>
<!DOCTYPE html>
<html>
<head>
<% FortuneBean fortunebean =(FortuneBean)request.getAttribute("占う"); %>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   out.println("<h1>↓" + fortunebean.getToday() + "↓</h1>");
   out.println("<h1>" + fortunebean.getFortune() + "</h1>");
%>

</body>
</html>