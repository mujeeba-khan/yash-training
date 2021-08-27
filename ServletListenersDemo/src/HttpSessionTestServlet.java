

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/HttpSessionTestServlet")
public class HttpSessionTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	public void init(ServletConfig config) throws ServletException 
	{
		System.out.println("----------init method is called in-----------"
				+ this.getClass().getName());
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter();
		
		sleep();
		HttpSession session = request.getSession();
		sleep();
		session.invalidate();
		
	}


	private void sleep() 
	{
		try 
		{
			Thread.sleep(12000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}

}
