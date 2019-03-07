package tp3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletVote
 */
@WebServlet("/exo2")
public class ServletVote extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletVote() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int age = 0;
		String preAge =request.getParameter("age");
		if(preAge != null) {
			 age = Integer.parseInt(request.getParameter("age"));
			 if(age >= 18)
				 out.println("<span class=\"d-block p-2 bg-primary text-white\">cet electeur peut voter</span>");
			 else
				 out.print("  <span class=\\\"d-block p-2 bg-primary text-white\\\">il ne peut pas voter</span>");
		}	
	}
	
}
