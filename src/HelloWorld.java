import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;

//@WebServlet(name="HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
		public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			writer.print("<html><body><h1>Hola mundo</h1>" + new Date().toString() + "</body></html>");
		}
		
}

