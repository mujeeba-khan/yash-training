<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="loginProcess.jsp" method="post">
		<table border="1" style="margin:auto;">
			<tr>
				<td>User id</td>
				<td><input type="text" name="userid"/></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="pwd"/></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><a href="#">Registration</a>&nbsp;
				<input type="submit" value="Login"/></td>
			</tr>
		</table>
	</form>
</body>
</html>