

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/EmployeeNextController")
public class EmployeeNextController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String ename = request.getParameter("name");
		String econtact = request.getParameter("contact");
		HttpSession session = request.getSession();
		session.setAttribute("empname", ename);
		session.setAttribute("empcontact", econtact);
		ServletContext application = getServletContext();
		application.getRequestDispatcher("/employee_next.html").forward(request, response);
	}

}
