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
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String fname = request.getParameter("firstName");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("firstName", fname);
		
		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		
		out.println("FirstName: "+fname+"<br>");
		
		out.println("<html>\r\n"+ 
				"<body>\r\n" + 
				"<form action=SecondServlet >\r\n" + 
				"<label for = lastName>LastName</label><br>\r\n" + 
				"<input type=text name=lastName /><br>\r\n" + 
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
