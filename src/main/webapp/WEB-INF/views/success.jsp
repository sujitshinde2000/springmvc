<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${Header}</h1>
	<h1>${Desc }</h1>
	<h1 style="color:green">${msg }</h1>
	<h1>Welcome	, ${user.userName}</h1>
	<h1>Your email address is ${user.userEmail} </h1>
	<h1>Your password is ${user.userPassword} try to secure password</h1>


</body>
</html>