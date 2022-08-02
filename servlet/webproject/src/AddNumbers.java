import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddNumbers extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException
    {
        res.setContentType("text/html");//setting the content type
        PrintWriter pw=res.getWriter();//get the stream to write the data
        String aStr = req.getParameter("number1"); // 10
        if(aStr == null || aStr.isBlank()){
            pw.println("Please enter valid Number for Number 1");
        }
        int a = Integer.parseInt(aStr);

        String bStr = req.getParameter("number2"); // 20
        if(bStr == null || bStr.isBlank()) {
            pw.println("Please enter valid Number for Number 2");
        }
        int b = Integer.parseInt(bStr);

        int total = a + b;
        pw.println("<h3>Total = " + total + "</h3>"); // <h3>Total = 30</h3>
        pw.close();
    }

}
