import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;  

public class FirstServlet extends HttpServlet
{ 
 
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
	{
		res.setContentType("text/html");//setting the content type  
		PrintWriter pw=res.getWriter();//get the stream to write the data  
		  
		//writing html in the stream  
		pw.println("<html><body>");  
		pw.println("Welcome to servlet <br/>");  
		String countryName = req.getParameter("country"); //query parameter variable name which is coming from client
		pw.println("The entered country Name is <b> " + countryName + "</b>");
		pw.println("</body></html>");  
		pw.close();//closing the stream
	}
}  