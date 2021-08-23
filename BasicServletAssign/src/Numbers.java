

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Numbers")
public class Numbers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		//int num = Integer.parseInt(request.getParameter("num"));
		int counteven=0,countodd=0,countprime=0;
		int m=100/2,flag=0;      
		 
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				counteven++;
			}
			if(i%2!=0)
			{
				countodd++;
			}
			
			for(int j=2;j<=m;j++) 
			{
				if(i%j==0)
				{      
					flag=1;      
					break;      
				}      
			}      
			if(flag==0)  { countprime++; }  
		}
		
		out.println("Count of even no.s. present from 1 to 100 are: "+counteven+"<br>");
		out.println("Count of odd no.s. present from 1 to 100 are: "+countodd+"<br>");
		out.println("Count of prime no.s. present from 1 to 100 are: "+countprime+"<br>");
	}

	

}
