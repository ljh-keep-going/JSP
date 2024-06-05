<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="layui/css/layui.css">
</head>
<body>
<fieldset class="layui-elem-field layui-field-title">
<legend>工资情况表</legend>
<script src="layui/layui.js"></script>
<script>
layui.use(['layer', 'form'], function(){
  var layer = layui.layer
  ,form = layui.form;
  layer.msg('刷新成功');
});
</script> 

<c:if test="${user.userType == 1}">
&nbsp&nbsp&nbsp<a href="salaryAdd.jsp" title="增加"><i class="layui-icon layui-icon-add-circle" style="font-size: 30px; color: #1E9FFF;"></i></a>
</c:if><br>
<table class="layui-table">
<tr>
<th>序号</th>
<th>姓名</th>
<th>员工工号 </th>
<th>工资月份</th>
<th>基础工资</th>
<th>加班费</th>
<th>奖金</th>
<th>最终工资</th>

<c:if test="${user.userType == 1}">
<th>操作</th>
</c:if>

</tr>
<c:forEach items="${salaryList }" var="salary">
<tr>
<td>${salary.employeeNo }</td>
<td>${salary.employeeName}</td>
<td>${salary.employeeId}</td>
<td>${salary.salaryMonth}</td>
<td>${salary.basicSalary}</td>
<td>${salary.overtimePay}</td>
<td>${salary.bonus}</td>
<td>${salary.finalSalary}</td>

<c:if test="${user.userType == 1}">
<td>
<c:if test="${user.userType == 1}">
<a href="SalaryServlet?method=toUpdate&employeeNo=${salary.employeeNo }" title="编辑"><i class="layui-icon layui-icon-edit" style="font-size: 30px; color: #1E9FFF;"></i></a>
</c:if>
<c:if test="${user.userType == 1}">
<a href="SalaryServlet?method=del&employeeNo=${salary.employeeNo }" title="删除"><i class="layui-icon layui-icon-delete" style="font-size: 30px; color: #1E9FFF;"></i></a>
</c:if>
</td>
</c:if>

</tr>
</c:forEach>
</table>
</body>
</html>