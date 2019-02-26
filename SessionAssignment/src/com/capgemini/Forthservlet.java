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
 * Servlet implementation class Forthservlet
 */
@WebServlet("/Forthservlet")
public class Forthservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Forthservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		String firstName = (String)session.getAttribute("firstName");

		out.println("FirstName: "+firstName+"<br>");
		
		String lastName = (String)session.getAttribute("lastName");

		out.println("LastName: "+lastName+"<br>");

		String qual = (String) session.getAttribute("qualification");
		
		out.println("Qualification: "+qual+"<br>");
		
		String marks = request.getParameter("marks");
		
		out.println("Marks: "+ marks);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
