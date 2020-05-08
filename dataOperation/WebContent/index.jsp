<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
    <form action="./Result" method= "post">
        <p>
        <label>名前:<input type= "text" name="NAME"></label>
        </p>
        <p>
        <label>性別:</label>
        <input type= "radio" name="GENDER" value="1">男
        <input type= "radio" name="GENDER" value="2">女
        </p>
        <p>
        <label>お問い合わせ種類</label>
        <br>
        <select name ="QTyoe">
        <option value ="a">製品について</option>
        <option value ="b">不具合やクレーム</option>
        <option value ="c">アフターサポート</option>
        </select>
        </p>
        <p>
        <label>お問い合わせ内容</label>
        <br>
        <textarea name= "comment"rows="4" cols=" 40" placeholder="    150文字以内で入力してください"></textarea>
        </p>
        <p>
        <label><input type="submit" value="送信"></label>
    </form>
</body>
</html>