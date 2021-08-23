

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Fibonacci")
public class Fibonacci extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<h4>------------Fibonacci series upto 15 terms------------</h4><br><br>");
		ServletConfig config =  getServletConfig();
		int n1 = Integer.parseInt(config.getInitParameter("n1"));
		int n2 = Integer.parseInt(config.getInitParameter("n2"));
		
		out.print(n1+" "+n2);
		for(int i=2;i<15;++i)    
		{    
			int n3=n1+n2;    
			out.print(" "+n3);    
			n1=n2;    
			n2=n3;    
		}    
	}


}
