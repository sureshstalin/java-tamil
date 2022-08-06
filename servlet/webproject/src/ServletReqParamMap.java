import javax.servlet.http.*;  
import javax.servlet.*;
import javax.swing.text.html.parser.Entity;
import java.io.*;  
import java.util.*;

public class ServletReqParamMap extends HttpServlet
{ 
 
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
	{  
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
        Map<String,String[]> map = req.getParameterMap();
        Iterator<Map.Entry<String,String[]>> entries = map.entrySet().iterator();
        while(entries.hasNext()) {
         Map.Entry<String,String[]> entry = entries.next();
         pw.println("Name " + entry.getKey() + "....</br>");
         String values[] = entry.getValue();
            for (String value: values) {
                pw.println("value <b> " + value + "</b>");
            }
            pw.println("</br>");
        }
		pw.println("<html><body>");  
		pw.close();//closing the stream  
	}
}  