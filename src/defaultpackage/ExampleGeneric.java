package defaultpackage;

import javax.servlet.http.*; 
import javax.servlet.*; 
import java.io.*; 

public class ExampleGeneric extends HttpServlet{ 

	private static final long serialVersionUID = -8852609235235544061L;

	@Override
	   public void doGet(HttpServletRequest req,HttpServletResponse res) 
	   throws ServletException,IOException 
	   {  
	     res.setContentType("text/html"); 
	     PrintWriter pwriter=res.getWriter(); 
	     String name = req.getParameter("uname");
	     String age = req.getParameter("uage");
	     pwriter.println("Name: "+name); 
	     pwriter.println("Age: "+age); 
	     pwriter.close(); 
	  }
	}

