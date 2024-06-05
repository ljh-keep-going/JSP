<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="SalaryServlet?method=update">
<div style="text-align:center">
<br><br>
<input type="hidden" name="employeeNo" value="${salary.employeeNo}">
姓名：<input type="text" name="employeeName" value="${salary.employeeName}"><br><br>
员工工号：<input type="text" name="employeeId" value="${salary.employeeId}"><br><br>
工资月份：<input type="text" name="salaryMonth" value="${salary.salaryMonth}"><br><br>
基础工资：<input type="text" name="basicSalary" value="${salary.basicSalary}"><br><br>
加班费：<input type="text" name="overtimePay" value="${salary.overtimePay}"><br><br>
奖金：<input type="text" name="bonus" value="${salary.bonus}"><br><br>
最终工资：<input type="text" name="finalSalary" value="${salary.finalSalary}"><br><br>

<input type="submit" value="保存修改">
</form>
</body>
</html>