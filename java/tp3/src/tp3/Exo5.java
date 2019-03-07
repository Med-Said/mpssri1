package tp3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exo5
 */
@WebServlet("/exo5")
public class Exo5 extends HttpServlet {
	
	
	
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
	}
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nom = request.getParameter("nom");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("affiche le remote addresse \n");
		out.println("<h2>RemoteAddr : " + request.getRemoteAddr() + "</h2>");
		out.println("bla bla ... \n");
		out.println("<h2>ServerName : " + request.getServerName() + "</h2>");
		out.println("bla bla ... \n");
		out.println("<h2>ServerPort : " + request.getServerPort() + "</h2>");
		out.println("bla bla ... \n");
		out.println("<h2>RemotHote : " + request.getRemoteHost() + "</h2>");
		out.println("bla bla ... \n");
		out.println("<h2>Method : " + request.getMethod() + "</h2>");
		out.println("bla bla ... \n");
		out.println("<h2>Parameter : " + nom + "</h2>");
		out.println("</html></body>");
		
		
		
		
		
		
		//question 2 
		out.println("<h1>Questioin 2</h1>");
		out.println("<ul>"
				+ "<li>"+ request.getRemoteAddr() + "</li>"
				+ "<li>"+ request.getServerName() + "</li>"
				+ "<li>"+ request.getServerPort() + "</li>"
				+ "<li>"+ request.getRemoteHost() + "</li>"
				+ "<li>"+ request.getMethod() + "</li>"
				+ "<li>"+ nom + "</li>"
				+ "</ul>");
		out.close();
		
		
	}



}
