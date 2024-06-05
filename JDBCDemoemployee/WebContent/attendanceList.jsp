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
<legend>职工考察信息管理表</legend>
<script src="layui/layui.js"></script>
<script>
layui.use(['layer', 'form'], function(){
  var layer = layui.layer
  ,form = layui.form;
  layer.msg('刷新成功');
});
</script> 

<c:if test="${user.userType == 1}">
&nbsp&nbsp&nbsp<a href="attendanceAdd.jsp" title="增加"><i class="layui-icon layui-icon-add-circle" style="font-size: 30px; color: #1E9FFF;"></i></a><br>
</c:if><br>

<table class="layui-table">
<tr>
<th>员工工号</th>
<th>姓名</th>
<th>部门</th>
<th>职位</th>
<th>请假次数</th>
<th>迟到次数</th>
<th>加班次数</th>
<th>打卡次数</th>
<th>考勤情况</th>

<c:if test="${user.userType == 1}">
<th>操作</th>
</c:if>

</tr>

<c:forEach items="${attendanceList }" var="attendance">
<tr>
<td>${attendance.attendanceId }</td>
<td>${attendance.attendanceName}</td>
<td>${attendance.attendanceDept}</td>
<td>${attendance.attendancePost}</td>
<td>${attendance.attendanceGet}</td>
<td>${attendance.attendanceLate}</td>
<td>${attendance.attendanceAdd}</td>
<td>${attendance.attendanceCard}</td>
<td>${attendance.attendanceCond}</td>

<c:if test="${user.userType == 1}">
<td>
<c:if test="${user.userType == 1}">
<a href="AttendanceServlet?method=toUpdate&attendanceId=${attendance.attendanceId }" title="编辑"><i class="layui-icon layui-icon-edit" style="font-size: 30px; color: #1E9FFF;"></i></a>
</c:if>
<c:if test="${user.userType == 1}">
<a href="AttendanceServlet?method=del&attendanceId=${attendance.attendanceId }" title="删除"><i class="layui-icon layui-icon-delete" style="font-size: 30px; color: #1E9FFF;"></i></a>
</c:if>
</td>
</c:if>
</tr>
</c:forEach>
</table>
</body>
</html>