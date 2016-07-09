<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.alibaba.fastjson.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!-- <script type="text/javascript">  

    function selectUser() {  
        var form = document.forms[0];  
        form.action = "${pageContext.request.contextPath}/employee/getAll";   
        form.method = "post";  
        form.submit();  
    }  
</script>   -->

<!-- <script type="text/javascript"
	src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script> -->



</head>
<body>
	<form>
		<table>
			<tr>
				<td>账号</td>
				<td><input type="text" id="username" name="username"></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" id="password" name="password">
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="button" value="提交" onclick="selectUser();">

					<!--   <input type="button" id="button_submit" value="提交"> --></td>
			</tr>
		</table>
	</form>
</body>
</html>
