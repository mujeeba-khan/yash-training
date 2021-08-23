

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Addition")
public class Addition extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("------------Addition of two no.s passed as config parameters------------<br>");
		ServletConfig config =  getServletConfig();
		int n1 = Integer.parseInt(config.getInitParameter("n1"));
		int n2 = Integer.parseInt(config.getInitParameter("n2"));
		
		out.println("n1 = "+n1+"<br>");
		out.println("n2 = "+n2+"<br>");
		out.println("Sum: "+(n1+n2)+"<br>");
	}

}
