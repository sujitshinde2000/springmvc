<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
<%-- 
	 modelandView method	
		<%
				String name = (String)request.getAttribute("name");
				Integer rollnumber = (Integer) request.getAttribute("rollnumber");
				LocalDateTime time=(LocalDateTime)request.getAttribute("time");
		%>

		<h1>Hello My name is <%=name %></h1>
		<h1>This is help page</h1>
		<h1>My roll number is <%=rollnumber %></h1>
		<h1>Date and Time is <%=time %></h1>
		 
		 --%>
		<!--  using expression language-->
		<h1>Hello My name is ${name} </h1>
		<h1>This is help page</h1>
		<h1>My roll number is ${rollnumber} </h1>
		<h1>Date and Time is ${time} </h1>
		
</body>
</html>