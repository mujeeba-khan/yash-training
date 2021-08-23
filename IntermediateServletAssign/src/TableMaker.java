

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TableMaker")
public class TableMaker extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("---------Table with 25 rows and 10 columns--------<br>");
		
		out.println("<table style='border: 1px solid black;'>");
		for(int i=1;i<=25;i++)
		{
			out.println("<tr>");
			for(int j=1;j<=10;j++)
			{
				out.println("<td style='border: 1px solid black;'>Row"+i+"Col"+j+"</td>");
			}
			out.println("</tr>");
		}
		out.println("</table>");
		
	}

}
