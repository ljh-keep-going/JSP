<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<link rel="stylesheet" href="layui/css/layui.css">
</head>
<body>
<form method="post" action="AttendanceServlet?method=add">
<div style="text-align:center">
<br><br>
姓名：<input type="text" name="attendanceName"><br><br>
部门：<input type="text" name="attendanceDept"><br><br>
职位：<input type="text" name="attendancePost"><br><br>
请假次数：<input type="text" name="attendanceGet"><br><br>
迟到次数：<input type="text" name="attendanceLate"><br><br>
加班次数：<input type="text" name="attendanceAdd"><br><br>
打卡次数：<input type="text" name="attendanceCard"><br><br>
考勤情况：<input type="text" name="attendanceCond"><br><br>

<br>
<input type="submit" value="保存" class="layui-btn layui-btn-radius layui-btn-normal">
</form>
</body>
</html>