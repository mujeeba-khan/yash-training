<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jstl tags</title>
</head>
<body>

	<!-- core tags -->

	<c:out value="${'Hello, Welcome to jstl world...'}"/>
	<c:set var="age" scope="session" value="${18}"/>
	Age: <c:out value="${age}"/>
	<c:if test="${age>=18}"/>
		<p>Eligible voter</p>
	<br>
	<c:choose>
		<c:when test="${age<18}">
			Not eligible to vote..!
		</c:when>
		<c:when test="${age>=18}">
			Eligible to vote..!
		</c:when>
		<c:otherwise>
			Invalid data
		</c:otherwise>
	</c:choose>
	<br>
	<c:forEach var="i" begin="1" end="10">
		Integers <c:out value="${i}"/> <br>
	</c:forEach>
	<br>
	<c:remove var="age"/>
	<p>After removing age: <c:out value="${age}"/></p>
	<br>
	
	<c:import var="data" url="/showInfo.jsp"/>
	<c:out value="${data}"/>
	<br>
	<c:url value="/showInfo.jsp" var="sh"/>
	<h4><a href="${sh}">Click here</a></h4>
	<br>
	<c:redirect url="/showInfo.jsp"/>
	<br>
	<c:url value="/hello.jsp" var="hello">
		<c:param name="name" value="Zainab"></c:param>
	</c:url>
	<h4><a href="${hello}">Click here</a></h4>
	
</body>
</html>