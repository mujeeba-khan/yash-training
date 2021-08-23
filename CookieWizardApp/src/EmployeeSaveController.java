

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeSaveController")
public class EmployeeSaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ename = request.getParameter("name");
		String econtact = request.getParameter("contact");
		String eemail = request.getParameter("email");
		String eaddress = request.getParameter("address");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Cookie[] cookies = request.getCookies(); 
		if(cookies!=null)
		{
			for(Cookie cookie:cookies)
			{
				if(cookie.getName().equals("empid"))
				{
					out.println("Name: "+ename);
					out.println("<br>Contact: "+econtact);
					out.println("<br>Email: "+eemail);
					out.println("<br>Address: "+eaddress);
				}
			}
		}
		getServletContext().getRequestDispatcher("/employee.html").forward(request, response);		
		
	
	}

}
