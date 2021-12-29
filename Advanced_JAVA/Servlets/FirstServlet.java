
import javax.servlet.*;
import java.io.*;


/**
 * FirstServlet
 */
public class FirstServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<b> Hello World!</b>");
        out.close();
        
    }
    
}