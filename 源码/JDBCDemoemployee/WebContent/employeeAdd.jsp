<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="layui/css/layui.css">
</head>
<body>
<form method="post" action="EmployeeServlet?method=add">
<div style="text-align:center">
<br><br>
姓名：<input type="text" name="employeeName"><br><br>
性别：<input type="text" name="employeeSex"><br><br>
年龄：<input type="text" name="employeeAge"><br><br>
部门：<input type="text" name="employeeDept"><br><br>
职位：<input type="text" name="employeepost"><br><br>
电话：<input type="text" name="employeeTel"><br><br>
邮箱：<input type="text" name="employeeEmail"><br><br>

<br>
<input type="submit" value="保存" class="layui-btn layui-btn-radius layui-btn-normal">
</form>
</body>
</html>