<%
	String result = request.getParameter("result");
	String submit = request.getParameter("submit");
%>

<html>
<body>

<%
	if(submit.equals("Add"))
	{
%>
	Result of Add: <%=result %>
<%}

	else{
%>
	Result of Sub: <%=result %>
<%} %>

<jsp:include page="/home.html"></jsp:include>

</body>
</html>
		
