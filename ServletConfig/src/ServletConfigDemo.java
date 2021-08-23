

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletConfigDemo")
public class ServletConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("------------Company info------------<br><br>");
		ServletConfig config =  getServletConfig();
		String cn = config.getInitParameter("companyName");
		String ce = config.getInitParameter("companyEmail");
		
		out.println("<h4>Company name: "+cn+"<br> Company email: "+ce+"</h4><br>");
		
	}

}
