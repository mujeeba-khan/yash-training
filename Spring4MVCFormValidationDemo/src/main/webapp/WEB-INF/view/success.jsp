<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Enrollment Detail Confirmation</title>
<style type="text/css">
.success {
	position: fiexd;
	width: 50%;
	margin-left: 50px;
	margin-top: 20px;
	padding: 20px;
	background-color: #E8E1E1;
	border: 1px solid #ddd;
	border-radius: 4px;
}
</style>
</head>
<body>
	<div class="success">
		Confirmation message : ${success} <br> We have also sent you a
		confirmation mail to your email address : ${student.email}.
	</div>
</body>
</html>
