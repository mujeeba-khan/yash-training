

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionCounterSample
 */
@WebServlet("/SessionCounterSample")
public class SessionCounterSample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		boolean create=true;
		
		HttpSession session = request.getSession(create);
		
		Integer counter = (Integer)session.getAttribute("myCounter");
		if(counter==null)
		{
			counter=1;
		}
		else
		{
			counter++;
		}
		
		session.setAttribute("mycounter", counter);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Session Tracking Demo</title></head>");
		out.println("<body>");
		out.println("<h1>Session tracking counter sample..</h1>");
		out.println("You have hit this page : "+counter+" times..");
		out.println("<br>Your session cookie : "+request.getParameter("Cookie"));
		out.println("<br>Your session id : "+session.getId());
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
