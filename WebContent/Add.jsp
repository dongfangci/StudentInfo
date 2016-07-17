<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"   import= "java.util.*,servlet.*,Beans.Student,Jdbc.DBUtil,service.StudentAction"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Insert title here</title>
	<style type="text/css">
		h3{
			text-align:center;
		}
	</style>
	</head>
<body>
	<h3>增加学生信息</h3>
	<form action="Add"  method="post">
		
		<label for="name">学号：</label>
		<input type="text" name="sid" /><br>
		<label for="name">姓名：</label>
		<input type="text" name="name" /><br>
		
		<label for="name">性别：</label>
		<input type="text" name="sex" /><br>
		
		<label for="name">年龄：</label>
		<input type="text" name="age" /><br>
		<input type="submit" value="提交">
	</form>
	
	
</body>
</html>