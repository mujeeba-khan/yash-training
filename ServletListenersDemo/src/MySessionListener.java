

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MySessionListener
 *
 */
@WebListener
public class MySessionListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent arg0) 
    { 
    	System.out.println("----------sessionCreated method is called in-----------"
				+ this.getClass().getName());
    	
    	HttpSession session = arg0.getSession();
    	
    	System.out.println(session+" Created..");
    	System.out.println("Session id: "+session.getId());
    	System.out.println("Session max inactive interval: "+session.getMaxInactiveInterval()+"\n");
    	
    }

	
    public void sessionDestroyed(HttpSessionEvent arg0)  
    { 
    	System.out.println("----------sessionDestroyed method is called in-----------"
				+ this.getClass().getName());
    	
    	HttpSession session = arg0.getSession();
    	System.out.println(session+" Destroyed..");
    	System.out.println("Session id: "+session.getId());
    	System.out.println("Session max inactive interval: "+session.getMaxInactiveInterval()+"\n");
    	
   
    }
	
}
