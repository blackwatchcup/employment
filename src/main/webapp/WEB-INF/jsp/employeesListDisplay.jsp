<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>Spring MVC Hello World</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<h2>All Employees in System</h2>

	<table border="1">
		<tr>
			<th>Employee Id</th>
			<th>First Name</th>
			<th>Last Name</th>
		</tr>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td>${employee.id}</td>
				<td>${employee.firstName}</td>
				<td>${employee.lastName}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>

