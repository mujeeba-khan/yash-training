<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- function tags -->
	
	<c:set var="exp" value="Hello, welcome to JSTL function."/>

	<c:if test="${fn:contains(exp, 'JSTL')}">
		<h4>String JSTL found in the exp.</h4>
	</c:if>

	<c:if test="${fn:startsWith(exp, 'Hello')}">
		<h4>String starts with Hello.</h4>
	</c:if>

	<c:if test="${fn:endsWith(exp, 'function')}">
		<h4>String ends with function</h4>
	</c:if>
	<br>
	<h4>Index of JSTL in the String: 
	<c:out value="${fn:indexOf(exp, 'JSTL')}" /></h4>
	<br>
	<h4>Substring of the given string:
	<c:out value="${fn:substring(exp, 6, 20)}" /></h4>
</body>
</html>