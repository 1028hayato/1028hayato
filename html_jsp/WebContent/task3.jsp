<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%String today = (new java.text.SimpleDateFormat("yyyy年MM月dd日").format(new java.util.Date()));%>

<%!int count = 0;%>

<%count++;%>

<meta charset="UTF-8">
<title>JSP KADAI</title>
</head>
<body>
<h1><%out.print("訪問回数:");%><%=count%></h1>
<p><%out.print("今日の日付:");%><%= today %><p>

</body>
</html>