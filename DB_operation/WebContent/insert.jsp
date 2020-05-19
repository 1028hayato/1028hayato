<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録フォーム</title>
</head>
<body>
    <form action="<%=request.getContextPath() %>/register" method = "post">
        <p>
        <label>ID</label>
        <br>
        <input type= "text" name="id">
        </p>

        <p>
        <label>名前</label>
        <br>
        <input type= "text" name="name">
        </p>

        <p>
        <label>誕生日</label>
        <br>
        <input type= "text" name="birthDay">
        </p>

        <p>
        <label>年齢</label>
        <br>
        <input type= "text" name="age">
        </p>

        <p>
        <label><input type="submit" value="登録"></label>
        </p>

    </form>
</body>
</html>