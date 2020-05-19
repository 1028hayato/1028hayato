<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>削除フォーム</title>
</head>
<body>
    <form action="<%=request.getContextPath() %>/DeleteEmployee " method = "post">
        <p>
        <label>削除するID</label>
        <br>
        <input type= "text" name="id">
        </p>

        <p>
        <label><input type="submit" value="削除"></label>
        </p>

    </form>
</body>
</html>