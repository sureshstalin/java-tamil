import javax.servlet.http.*;  
import javax.servlet.*;
import java.io.*;  

public class ServletReqParam extends HttpServlet
{ 
 
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
	{  
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String country = req.getParameter("country");
		//writing html in the stream
		pw.println("<html><body>");  
		pw.println("This is request Parameter Demo <br/>");  
		pw.println("Country: <b>" + country.toUpperCase() + "</b>");
		pw.println("</body></html>");  
		pw.close();//closing the stream  
	}
}  