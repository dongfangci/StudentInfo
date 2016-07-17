<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"   import= "java.util.*,servlet.*,Beans.Student,Jdbc.DBUtil,service.StudentAction"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Insert title here</title>
	<style type="text/css">
		h1{
			text-align:center;
		}
	</style>
	</head>
<body>
	<h1>成功插入一条信息</h1>
	<br>
	<%
	 out.print(request.getAttribute("name"));
	%>
	<br><strong><a href="index.jsp">返回主页</strong></a>
</body>
</html>