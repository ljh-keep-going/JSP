<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/index.css">
<title>Insert title here</title>
</head>
<body>
<div id="example2">
<form name="form1" method="post" action="RegisterServlet">
	
    <div class="details">
    	<h2 style="center">注册</h1><br>
	     	用户名 <input type="text" name="name"><br><br>
	      	密码 <input type="password" name="pwd"><br><br>
	      	员工类型<input type="userType" name="uselection"><br><br>
	       <tr>
	       <td><input type="submit"></td>
	       <td><input type="button" value="取消"/></td> 
	       </tr>
	  </div>
    
</form>
</div>
</body>
</html>