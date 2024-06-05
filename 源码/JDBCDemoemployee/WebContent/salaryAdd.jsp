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
<form method="post" action="SalaryServlet?method=add">
<div style="text-align:center">
<br><br>
姓名：<input type="text" name="employeeName"><br><br>
员工工号：<input type="text" name="employeeId"><br><br>
工资月份：<input type="text" name="salaryMonth"><br><br>
基础工资：<input type="text" name="basicSalary"><br><br>
加班费：<input type="text" name="overtimePay"><br><br>
奖金：<input type="text" name="bonus"><br><br>
最终工资：<input type="text" name="finalSalary"><br><br>
<br>
<input type="submit" value="保存" class="layui-btn layui-btn-radius layui-btn-normal">
</form>
</body>
</html>