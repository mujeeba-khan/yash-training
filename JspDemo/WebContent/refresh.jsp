<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.io.*,java.util.*"%>
<html>
<head>
<title>Auto Refresh</title>

<style>
    fieldset{
        display: flex;
        position: relative;
        text-align:center;
    }
	.forms{
        display: flex;
        position: relative;
        
    }
</style>
</head>
<body style="font-family: cursive;">

	<form class="forms">
		  <fieldset style="width:20%; background-color: #ccffeb;">
                <legend><b><i>Date Time</i></b></legend>
                <h3>Current Date and Time is :</h3>
                
                <%
                java.util.Date d = new java.util.Date();
                out.println(d.toString()); 
                
                %>
            </fieldset>
	
		<fieldset style="width: 20%; background-color: #2205;">
			<legend>Auto refresh</legend>
			<h2>Auto Refresh</h2>
			<%
                       // Set refresh, autoload time as 10 seconds
                       response.setIntHeader("Refresh", 5);
                       // Get current time
                       Calendar calendar = new GregorianCalendar();
                       String am_pm;
                       int hour = calendar.get(Calendar.HOUR);
                       int minute = calendar.get(Calendar.MINUTE);
                       int second = calendar.get(Calendar.SECOND);
                       if(calendar.get(Calendar.AM_PM) == 0)
                          am_pm = "AM";
                       else
                          am_pm = "PM";
                       String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
                       out.println("Current Time: " + CT + "\n");
                    %>
		</fieldset>
	     <fieldset style="width:20%; background-color:#e6ffe6;">
                <legend>Count visitor</legend>
                <%
                    Integer hitsCount =
                    (Integer)application.getAttribute("hitCounter");
                    if( hitsCount ==null || hitsCount == 0 )
                    {
                        /* First visit */
                        out.println("Welcome to my website!!");
                        hitsCount = 1;
                    }
                    else
                    {
                        /* return visit */
                        out.println("Welcome to my website!!");
                        hitsCount += 1;
                    }
                    application.setAttribute("hitCounter", hitsCount);
                %>
                <p>You are visitor number: <%= hitsCount%></p>
            </fieldset>
        </form>

          <form method=get action="test.jsp">
               Enter Any Number : <input type=text name=num><br><br>
               <input type=submit value="Display">
          </form>
</body>
</html>