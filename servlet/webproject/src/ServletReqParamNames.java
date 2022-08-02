import javax.servlet.http.*;  
import javax.servlet.*;
import java.io.*;  
import java.util.*;

public class ServletReqParamNames extends HttpServlet
{ 
 
public void doPost(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException  
	{  
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		Enumeration en= req.getParameterNames();
        while(en.hasMoreElements()) {
            String name = (String) en.nextElement();
            String value = req.getParameter(name);
            pw.println("Name " + name + "</br>"); // country , gender , employee
            pw.println("Value " + value + "</br>"); // India , Female, Raja
        }

//		while(en.hasMoreElements()){
//			String paramName = (String)en.nextElement();
//			String paramValue = req.getParameter(paramName);
//			pw.println("Param Name <b>" + paramName +  "</b>");
//			pw.println("Param Value <b>" + paramValue +  "</b>");
//			pw.println("<br/>");
//		}
		//writing html in the stream  
		pw.println("<html><body>");  
		pw.close();//closing the stream  
	}
}  