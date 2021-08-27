<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

	<%
	String submit = request.getParameter("submit");
	if(submit.equals("Add")){
	%>
	<jsp:forward page="/addjsp.jsp"></jsp:forward>
	<%}
	else if(submit.equals("Sub")){
	%>
	<jsp:forward page="/subjsp.jsp"></jsp:forward>
	<%}
	else{
	%>
	<jsp:forward page="/home.html"></jsp:forward>
	<%}%>