package com.blascode.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Book extends Publication implements IVisualilizable {

	private int id;

	private String isbn;
	private boolean readed;
	private int timeReaded;

	public Book(String title, Date edititionDate, String editorial, String isbn, boolean readed, int timeReaded) {
		super(title, edititionDate, editorial);
		// TODO Auto-generated constructor stub

		this.isbn = isbn;
		this.readed = readed;
		this.timeReaded = timeReaded;
	}

	/*
	 * public Book(String title, Date edititionDate, String editorial, String
	 * isbn) { super(); this.title = title; this.edititionDate = edititionDate;
	 * this.editorial = editorial; this.isbn = isbn; }
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return ":::BOOK::: " + "TITLE: " + getTitle();
	}

	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {

		if (dateI.getSeconds() < dateF.getSeconds()) {
			setTimeReaded(dateF.getSeconds() - dateI.getSeconds());
		}else {
			setTimeReaded(0);
		}

	}

	public int getTimeReaded() {
		return timeReaded;
	}

	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}
	
	/*  // reto Implement Generador Book 
	public static ArrayList<Book> makeBooKList(){
		ArrayList<Book>book = new ArrayList();
		
		
		
		for (int i = 0; i <= 5; i++) {
			book.add(new Book("Libro"+ i,"fecEditorial"+ i,"Creador" ));			
		}
		
		
		return book;
	}*/

}
