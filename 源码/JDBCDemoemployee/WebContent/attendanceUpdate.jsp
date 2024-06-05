<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="AttendanceServlet?method=update">
<div style="text-align:center">
<br><br>
<input type="hidden" name="attendanceId" value="${attendance.attendanceId}">
姓名：<input type="text" name="attendanceName" value="${attendance.attendanceName}"><br><br>
部门：<input type="text" name="attendanceDept" value="${attendance.attendanceDept}"><br><br>
职位：<input type="text" name="attendancePost" value="${attendance.attendancePost}"><br><br>
请假次数：<input type="text" name="attendanceGet" value="${attendance.attendanceGet}"><br><br>
迟到次数：<input type="text" name="attendanceLate" value="${attendance.attendanceLate}"><br><br>
加班次数：<input type="text" name="attendanceAdd" value="${attendance.attendanceAdd}"><br><br>
打卡次数：<input type="text" name="attendanceCard" value="${attendance.attendanceCard}"><br><br>
考勤情况：<input type="text" name="attendanceCond" value="${attendance.attendanceCond}"><br><br>

<input type="submit" value="保存修改">
</form>
</body>
</html>