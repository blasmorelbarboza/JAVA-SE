package com.blascode.amazonviewer.model;

import java.util.Date;

public class Book extends Publication {

	
	private int id;

	private String isbn;
	private boolean readed;
	private int timeReaded;

	
	public Book(String title, Date edititionDate, String editorial,    String isbn , boolean readed , int timeReaded) {
		super(title, edititionDate, editorial );
		// TODO Auto-generated constructor stub
		 
		this.isbn= isbn; 
		 this.readed =readed ; 
		 this.timeReaded= timeReaded;
	}
	
	/*	
	public Book(String title, Date edititionDate, String editorial, String isbn) {
		super();
		this.title = title;
		this.edititionDate = edititionDate;
		this.editorial = editorial;
		this.isbn = isbn;
	}
	*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

		
}
