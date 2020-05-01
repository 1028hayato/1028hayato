<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date"%>

<html>
<head>

<%!int count = 0;%>

<%
count++;

SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
Date today = new Date();
%>

<meta charset="UTF-8">
<title>JSP KADAI</title>
</head>
<body>
   <h1>訪問回数:<%= count%></h1>

   <p>今日の日付:<%= sdf.format(today) %><p>

</body>
</html>