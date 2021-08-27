<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- formatting tags -->
	
	<c:set var="num" value="324123.23234"/>
    Setting type to currency: <br/>
    <fmt:formatNumber value="${num}" type="currency"/> <br/>
    Setting max Integer Digits and max Fraction Digits:
    <br/>
    <fmt:formatNumber type="number" maxIntegerDigits="4" 
    maxFractionDigits="3" value="${num}" /> <br/>
    Number after setting pattern attribute: <br/>
    <fmt:formatNumber type="number" pattern="##,###.##" value="${num}" />
    
    <c:set var="currentDate" value="<%=new java.util.Date()%>"/>
    <br/>
    Current date: <c:out value="${currentDate}"/>
    <br/>
    Current date in date format: <fmt:formatDate value="${currentDate}"/>
    <br/>
    Current date in short style: <fmt:formatDate type="both" dateStyle="short" value="${currentDate}"/>
	 <br/>
	   Time Zone List: 
	   <table>
	     <c:forEach var="timeZone" 
                       items="<%=java.util.TimeZone.getAvailableIDs()%>">
			  <tr>
			    <td>
			      <c:out value="${timeZone}" />
			    </td>
			    <td> 
			      <fmt:timeZone value="${timeZone}">
			        <fmt:formatDate 
                                   value="${currentDate}" type="both" />
			      </fmt:timeZone>
			    </td>
			  </tr>
		   </c:forEach>
		</table>
	
</body>
</html>