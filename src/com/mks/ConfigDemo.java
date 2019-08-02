package com.mks;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigDemo
 */
@WebServlet(urlPatterns = { "/ConfigDemo" }, initParams = {
		@WebInitParam(name = "adminEmail", value = "admin@cognizant.com", description = "nothing") })
public class ConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String adminEmail;

	public void init(ServletConfig config) throws ServletException {
		adminEmail = config.getInitParameter("adminEmail");
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConfigDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<html><head><title>Config Demo</title></head><body>");
		out.print("<h1>The Admin email is " + adminEmail + "</h1></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
