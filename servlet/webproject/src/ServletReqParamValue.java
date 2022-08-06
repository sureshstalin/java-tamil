import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ServletReqParamValue extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        String countries[] = req.getParameterValues("country"); // multiple value or single value
        String colors[] = req.getParameterValues("color"); // multiple value or single value
        String employee[] = req.getParameterValues("employee"); // one value

        // India || Singapore
        String country = Arrays.stream(countries).collect(Collectors.joining("||")).toUpperCase();
        String colours = Arrays.stream(colors).collect(Collectors.joining("---")).toUpperCase();
        String emp = employee[0].toUpperCase();
        pw.println(colours + "</br>");
        pw.println(country + "</br>");
        pw.println(emp);
        pw.close();
        //closing the stream
    }
}  