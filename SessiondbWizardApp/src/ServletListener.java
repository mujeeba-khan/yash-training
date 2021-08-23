import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletListener implements ServletContextListener
{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		
		ServletContext sc = arg0.getServletContext();
		 
    	String url = sc.getInitParameter("url");
    	String user_name = sc.getInitParameter("user_name");
    	String password = sc.getInitParameter("password");
    	//Database db = new Database(url, user_name, password);
    	
    	//sc.setAttribute("db", db);
		
	}
	
}
