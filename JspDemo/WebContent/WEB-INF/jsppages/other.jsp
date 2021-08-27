<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%! int count;
	public void jspInit()
	{
		ServletConfig config = getServletConfig();
		count = Integer.parseInt(config.getInitParameter("count"));
		System.out.println("-----Inside jspInit()-------");
	}
%>

<h2>Use of page, session, out, config and application implicit objects</h2>

Count value without using config implicit object : <b> <%=count %></b> <br>

<%

this.log("log message");
((HttpServlet)page).log("another message..");
ServletContext context = config.getServletContext();
out.println("Value of session var is = "+"&nbsp;&nbsp;<b>"+session.getAttribute("sessionvar")+"</b><br>");
out.println("Server name and version using config implicit object: &nbsp;&nbsp;<b>"+context.getServerInfo()+"</b><br>");
out.println("Value of context parameter param1 get using application implicit object: &nbsp;&nbsp;<b>"+application.getInitParameter("param1")+"</b><br>");
out.println("Count value retrieved using config implicit object: &nbsp;&nbsp;<b>"+config.getInitParameter("count"));

%>



</body>
</html>