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
<legend>员工基础信息表</legend>
<script src="layui/layui.js"></script>
<script>
layui.use(['layer', 'form'], function(){
  var layer = layui.layer
  ,form = layui.form;
  layer.msg('刷新成功');
});
</script> 

<c:if test="${user.userType == 1}">
&nbsp&nbsp&nbsp<a href="employeeAdd.jsp" title="增加"><i class="layui-icon layui-icon-add-circle" style="font-size: 30px; color: #1E9FFF;"></i></a>
</c:if><br>

<table class="layui-table">
<tr>
<th>员工号</th>
<th>姓名</th>
<th>性别</th>
<th>年龄</th>
<th>部门</th>
<th>职位</th>
<th>联系方式</th>
<th>邮箱</th>
<th>操作</th>
</tr>

<c:forEach items="${employeeList }" var="employee">
<tr>
<td>${employee.employeeId }</td>
<td>${employee.employeeName}</td>
<td>${employee.employeeSex}</td>
<td>${employee.employeeAge}</td>
<td>${employee.employeeDept}</td>
<td>${employee.employeepost}</td>
<td>${employee.employeeTel}</td>
<td>${employee.employeeEmail}</td>

<td>
<a href="EmployeeServlet?method=toUpdate&employeeId=${employee.employeeId }" title="编辑"><i class="layui-icon layui-icon-edit" style="font-size: 30px; color: #1E9FFF;"></i></a>
<c:if test="${user.userType == 1}">
<a  href="EmployeeServlet?method=del&employeeId=${employee.employeeId }" title="删除"><i class="layui-icon layui-icon-delete" style="font-size: 30px; color: #1E9FFF;"></i></a>
</c:if>
</td>

</tr>
</c:forEach>
</table>
</body>
</html>