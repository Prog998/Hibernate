package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")

public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idBook")
	private int idBook;
	
	@Column(name="nameBook")
	private String nameBook;
	
	@Column(name="author")
	private String author;
	
	@Column(name="isbn")
	private String isbn;
	
	public int getIdbook() {
		return idBook;
	}
	
//	public void setIdbook(int idBook) {
//		this.idBook = idBook;
//	}
	
	public String getNamebook() {
		return nameBook;
	}
	
	public void setNamebook(String nameBook) {
		this.nameBook = nameBook;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}
