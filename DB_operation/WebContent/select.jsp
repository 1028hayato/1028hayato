<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索フォーム</title>
</head>
<body>
    <form action="<%=request.getContextPath() %>/search " method = "post">
        <p>
        <label>名前</label>
        <br>
        <input type= "text" name="NAME">
        </p>

        <p>
        <label><input type="submit" value="検索"></label>
        </p>

    </form>
</body>
</html>