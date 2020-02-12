package com.hibernate.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AltasLibrosServlet
 */
@WebServlet("/AltasLibrosServlet")
public class AltasLibrosServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nameBook = request.getParameter("txtNameBook");
		
		System.out.println("Nombre de Libro: " + nameBook);
	}

}
