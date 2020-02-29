package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sum")
public class HundredServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//한글인코딩
	resp.setContentType("text/html;charset=utf-8");
	//출력스트림객체
	PrintWriter out = resp.getWriter();
	int sum = 0;
	for(int i = 1; i<= 100; i++) {
		sum += i;
	}
	out.write("<html>");
	out.write("<head><title>1부터 100까지의 합</title></head>");
	out.write("<body>");
	out.write("1부터 100까지의 합은 " + sum + " 입니다.");
	out.write("</body>");
	out.write("</html>");
	out.close();
}
}
