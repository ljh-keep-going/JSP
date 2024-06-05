<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="EmployeeServlet?method=update">
<div style="text-align:center">
<br><br>
<input type="hidden" name="employeeId" value="${employee.employeeId}">
姓名：<input type="text" name="employeeName" value="${employee.employeeName}"><br><br>
性别：<input type="text" name="employeeSex" value="${employee.employeeSex}"><br><br>
年龄：<input type="text" name="employeeAge" value="${employee.employeeAge}"><br><br>
部门：<input type="text" name="employeeDept" value="${employee.employeeDept}"><br><br>
职位：<input type="text" name="employeepost" value="${employee.employeepost}"><br><br>
电话：<input type="text" name="employeeTel" value="${employee.employeeTel}"><br><br>
邮箱：<input type="text" name="employeeEmail" value="${employee.employeeEmail}"><br><br>

<input type="submit" value="保存修改">
</form>
</body>
</html>