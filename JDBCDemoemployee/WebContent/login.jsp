<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="layui/css/layui.css">
<link rel="stylesheet" href="css/index.css">
</head>
<body>
<div id="example2">
<form method="post" action="LoginServlet">
 <div class="wrapper">
        <div class="form-wrapper">
            <h1>欢迎回来！</h1>
            <form action="#">
                <div class="input-group">
	<label for="username">用户名：</label>
	<input type="text" name="uname"><br></div>
	 <div class="input-group">
    <label for="password">密  码：&nbsp&nbsp&nbsp</label>
	<input type="password" name="pass"><br></div>
用户选择：&nbsp&nbsp<input type="radio" value="0" name="uselection" checked>员工&nbsp&nbsp&nbsp
		<input type="radio" value="1" name="uselection">管理者
<br><br>
<input type="submit" class="an" value="登录" class="layui-btn layui-btn-sm layui-btn-radius layui-btn-danger"><br>
</form>
</div>
</body>
</html>