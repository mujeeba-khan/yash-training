

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/EmployeeSaveController")
public class EmployeeSaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String name = (String) session.getAttribute("empname");
		String contact = (String) session.getAttribute("empcontact");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		
		ServletContext application = getServletContext();
		String url = application.getInitParameter("url");
		String username = application.getInitParameter("username");
		String password = application.getInitParameter("password");
		
		try(Connection con = (Connection) DriverManager.getConnection(url,username,password);
				PreparedStatement pst = (PreparedStatement) con.prepareStatement
						("Insert into employee2(name,contact,email,address) values(?,?,?,?)");) 
		{
			Class.forName("com.mysql.jdbc.Driver");
			pst.setString(1, name);
			pst.setString(2, contact);
			pst.setString(3, email);
			pst.setString(4, address);
			pst.executeUpdate();
			
			out.println("\nRecord added successfully..");
		
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
