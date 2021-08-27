<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Citizens data</h2><br>
	<sql:setDataSource var="myDS" driver="com.mysql.cj.jdbc.Driver"
      url="jdbc:mysql://localhost:3306/mydb"
      user="root"  password="root"/>
      
    <sql:query dataSource="${myDS}" var="citizens">
      SELECT * from citizens;
    </sql:query>
    <table border="1"> 
      <c:forEach var="row" items="${citizens.rows}">
        <tr>
          <td><c:out value="${row.ssn}"/></td>
          <td><c:out value="${row.first_name}"/></td>
          <td><c:out value="${row.last_name}"/></td>
          <td><c:out value="${row.address}"/></td>
          <td><c:out value="${row.telephone}"/></td>
        </tr>
      </c:forEach>
   </table>
</body>
</html>