package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet{
@Override
public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter out = resp.getWriter();
	out.print("<html><head><title>servlet test</title></head></html>");
	out.print("<body>");
    out.print("Hello JSP<br>");
	out.print("Java Server Page");
	out.print("</body>");
	out.print("</html>");
	out.close();
   }
}
