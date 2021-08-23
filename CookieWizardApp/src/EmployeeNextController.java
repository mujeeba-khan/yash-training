

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeNextController")
public class EmployeeNextController extends HttpServlet{
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String eid = request.getParameter("id");
		Cookie c = new Cookie("empid",eid);
		c.setMaxAge(120);
		response.addCookie(c);
		response.sendRedirect("employee_details.html");
	}

}
