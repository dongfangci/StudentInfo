<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"   import= "java.util.*,servlet.*,Beans.Student,Jdbc.DBUtil,service.StudentAction"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Student报表</title>
	<style type="text/css">
		h1{
			text-align:center;
		}
	</style>
	</head>
	
	<body>
		<h1>学生信息管理系统</h1>
		<br>请选择：<br>
		<form action="MainServlet" method="post">
			<input type="radio" name="select" value="QueryAll" checked="checked">查询所有人员信息&nbsp
			<input type="radio" name="select" value="Add">增加人员信息&nbsp
			<input type="radio" name="select" value="Delete">删除人员信息&nbsp
			<input type="radio" name="select" value="Update">修改人员信息&nbsp
			<input type="radio" name="select" value="QueryByName">查询人员具体信息&nbsp
			<br>
			<input type="submit" value="提交">
		</form>
		
		
	
	</body>
</html>