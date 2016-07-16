<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"   import= "java.util.*,servlet.*,Beans.Student,Jdbc.DBUtil,service.StudentAction"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Java报表</title>
	<style type="text/css">
		table{
			text-align:center;
		}
	</style>
	</head>
	
<body>
	
	<table>
	<tr>
		<th colspan ="5">学生信息</th>
	</tr>
	
	<tr>
		<th>学号</th>
		<th>姓名</th>
		<th>性别</th>
		<th>年龄</th>
	</tr>
		
		
	
		<%
		 	List<Student> list = null;
			if(session.getAttribute("StudentName") != null){
				list = (List<Student>)session.getAttribute("StudentName");
				if(list.size() > 0){
					for(Student stu : list){
						%>
						<tr>
							<td><%= stu.getSid() %></td>
							<td><%= stu.getName() %></td>
							<td><%= stu.getSex() %></td>
							<td><%= stu.getAge() %></td>
						</tr>
						<%  
					}
					
				}
			}
		%>
	</table>

</body>
</html>