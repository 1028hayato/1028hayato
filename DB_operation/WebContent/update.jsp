<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>更新フォーム</title>
</head>
<body>
    <form action="<%=request.getContextPath() %>/UpdateEmployee " method = "post">
        <p>
        <label>ID</label>
        <br>
        <input type= "text" name="ID">
        </p>

        <p>
        <label>名前</label>
        <br>
        <input type= "text" name="NAME">
        </p>

        <p>
        <label><input type="submit" value="更新"></label>
        </p>

    </form>
</body>
</html>