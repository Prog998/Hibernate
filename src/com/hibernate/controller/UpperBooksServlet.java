package com.hibernate.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Book;

/**
 * Servlet implementation class AltasLibrosServlet
 */
@WebServlet("/UpperBooksServlet")
public class UpperBooksServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Configure Hibernate
		
		//Create object of the configuration
		//and associate to configuration file
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(com.hibernate.model.Book.class);
		cfg.configure("hibernate.cfg.xml");
		
		//Create session Factory
		SessionFactory factory = cfg.buildSessionFactory();
		
		//Create Session Object
		Session session = factory.openSession();
		
		//Initialing Transaction
		Transaction t = session.beginTransaction();
		
		
		
		//Object's creation 
		Book mybook = new Book();
		
		//Catch jsp data
		String nameBook = request.getParameter("txtNameBook");
		String author = request.getParameter("txtAuthor");
		String isbn = request.getParameter("txtIsbn");
		
		//Full my object with data captured
		mybook.setNamebook(nameBook);
		mybook.setAuthor(author);
		mybook.setIsbn(isbn);
		
		//Test of use data
		System.out.println("Name: " + mybook.getNamebook() + "\nAuthor: " + mybook.getAuthor() + "\nISBN: " + mybook.getIsbn());
		response.getWriter().append("Name: " + mybook.getNamebook() + "\nAuthor: " + mybook.getAuthor() + "\nISBN: " + mybook.getIsbn());
		
		session.save(mybook); //or persist is the same
		System.out.println("Object saved");
		
		//Execute the transaction
		t.commit();
		System.out.println("It made commit");
		
		//Create the session
		session.close();
		
		System.out.println("Saved successful");
	}

}
