package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")

public class Book {
	
	@Id
	@GeneratedValue
	@Column(name="idBook")
	private int idBook;
	
	@Column(name="nameBook")
	private String nameBook;
	
	public int getIdbook() {
		return idBook;
	}
	
	public void setIdbook(int idBook) {
		this.idBook = idBook;
	}
	
	public String getNamebook() {
		return nameBook;
	}
	
	public void setNamebook(String nameBook) {
		this.nameBook = nameBook;
	}
	
}
