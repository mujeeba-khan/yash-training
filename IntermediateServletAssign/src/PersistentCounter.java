

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PersistentCounter")
public class PersistentCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int count;

	public void init() throws ServletException {
		// Try to load the initial count from our saved persistent state
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader("InitDestroyCounter.initial");
			bufferedReader = new BufferedReader(fileReader);
			String initial = bufferedReader.readLine();
			count = Integer.parseInt(initial);
			return;
		}
		catch (Exception e) {} // corrupt saved state
		finally {
			// Make sure to close the file
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			}
			catch (IOException ignored) { }
		}

		// No luck with the saved state, check for an init parameter
		String initial = getInitParameter("initial");                    
		try {                                                            
			count = Integer.parseInt(initial);                             
			return;                                                        
		}                                                                
		catch (NumberFormatException ignored) { }  // null or non-integer value

		// Default to an initial count of "0"                            
		count = 0;                                                       
	}                           


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");                                
		PrintWriter out = response.getWriter();                               
		count++;                                                         
		out.println("Since the beginning, this servlet has been accessed " +
				count + " times.");                                  
	}

	public void destroy() {                                            
		super.destroy();  // entirely optional
		saveState();                                                     
	}                                                                  

	public void saveState() {                                          
		// Try to save the accumulated count                             
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		try {                                                            
			fileWriter = new FileWriter("InitDestroyCounter.initial");
			printWriter = new PrintWriter(fileWriter);         
			printWriter.println(count);                                  
			return;                                                        
		}                                                                
		catch (IOException e) {  // problem during write                 
			// Log the exception. See Chapter 5.                           
		}
		finally {
			// Make sure to close the file
			if (printWriter != null) {
				printWriter.close();
			}
		}
	}

}
