package com.mks;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;
	private String initcount;

	public void init(ServletConfig config) {
		context = config.getServletContext();
		initcount = context.getInitParameter("initialCount");
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HomeServlet() {
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
		String countValue = null;
		if (context.getAttribute("count") != null) {
			countValue = context.getAttribute("count").toString();
		} else {
			countValue = initcount;
		}

		int count = Integer.parseInt(countValue);
		count++;
		context.setAttribute("count", count);
	}

}
