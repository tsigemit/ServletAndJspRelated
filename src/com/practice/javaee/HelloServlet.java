package com.practice.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String yourFirstName = request.getParameter("yourFirstName");
		String yourLastName = request.getParameter("yourLastName");
		String yourAge = request.getParameter("yourAge");
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Here is you full infomation</h>");
		writer.println("<h1>Your First Name is: " + yourFirstName + "</h1>");
		writer.println("<h1>Your Last Name is: " + yourLastName + "</h1>");
		writer.println("<h1>Your Age is: " + yourAge + "</h1>");
		writer.close();

	}

}
