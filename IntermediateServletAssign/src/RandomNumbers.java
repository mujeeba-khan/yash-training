

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RandomNumbers")
public class RandomNumbers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("---------Random Numbers--------<br>");
		
		out.println("<ul>");
		for(int i=1;i<=4;i++)
		{
			Random rand = new Random();
	        int r = rand.nextInt(1000);
			out.println("<li>"+r+"</li>");
		}
		out.println("</ul>");
		
		
	}

}
