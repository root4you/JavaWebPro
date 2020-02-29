package unit01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add01")
public class AddServlet01 extends HttpServlet{
@Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int num1 = 20;
	int num2 = 10;
	int add = num1 + num2 ;
	
	req.setAttribute("num1", num1);
    req.setAttribute("num2", num2);
    req.setAttribute("add", add);
    
    RequestDispatcher rd =
          req.getRequestDispatcher("add01.jsp");
    rd.forward(req, resp);
   }
}