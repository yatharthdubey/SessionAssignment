package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		String qual = request.getParameter("qualification");

		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		String firstName = (String)session.getAttribute("firstName");

		out.println("FirstName: "+firstName+"<br>");
		
		String lastName = (String)session.getAttribute("lastName");

		out.println("LastName: "+lastName+"<br>");

		out.println("Qualification: "+qual+"<br>");
		
		session.setAttribute("qualification", qual);
		
		response.setContentType("text/html");
	
		out.println("<html>\r\n"+ 
				"<body>\r\n" + 
				"<form action=Forthservlet >\r\n" + 
				"<label for = Marks>Marks</label><br>\r\n" + 
				"<input type=text name=marks /><br>\r\n" + 
				"<input type = submit />\r\n" + 
				"</form>\r\n" + 
				"</body>\r\n" + 
				"</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
