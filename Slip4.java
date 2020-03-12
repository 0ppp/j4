 import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Slip4 extends HttpServlet
{
            public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
{
            response.setContentType(“text/html”);
            PrintWriter out= res.getWriter();
            out.println(“<HTML>”);
out.println(“<BODY>”);
 out.println(“Information Of Client: ”);
out.println(“IP Address : ” + req.getRemoteAddr() + ”\n”);
out.println(“Name : ” + req.getRemoteHost() + ”\n”);
out.println(“Information Of Server: ”);
out.println(“Name : ” + req.getServerName() + ”\n”);
out.println(“Port : ” + req.getServerPort() + ”\n”);
out.println(“</BODY>”);
out.println(“</HTML>”);

}
}
