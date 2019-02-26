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
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String lastName = request.getParameter("lastName");

		PrintWriter out = response.getWriter();

		response.setContentType("text/html");
		
		HttpSession session = request.getSession();
		
		String firstName = (String) session.getAttribute("firstName");
		
		out.println("FirstName: "+firstName+"<br>");
		
		session.setAttribute("lastName", lastName);

		out.println("LastName: "+lastName+"<br>");
	
		out.println("<html>\r\n"+ 
				"<body>\r\n" + 
				"<form action=ThirdServlet >\r\n" + 
				"<label for = Qualification>Qualification</label><br>\r\n" + 
				"<input type=text name=qualification /><br>\r\n" + 
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
