<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="practice.FortuneBean" %>
<!DOCTYPE html>
<html>
<head>
<% FortuneBean fortunebean =(FortuneBean)request.getAttribute("fortuneResult"); %>

<meta charset="UTF-8">
<title>Fortne_Result</title>
</head>
<body>
<%
   if(fortunebean != null){
       out.println("<h1>↓" + fortunebean.getToday() + "↓</h1>");

       out.println("<h1>" + fortunebean.getFortune() + "</h1>");
   }
%>
</body>
</html>