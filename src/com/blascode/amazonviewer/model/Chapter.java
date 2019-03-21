package com.blascode.amazonviewer.model;

public class Chapter extends Movie {
	
	private int id;

	private int timeViewed;
	private int sessionNumber;
	

	public Chapter(String title, String genre, String creator, int duration, short year) {
		super(title, genre, creator, duration, year);
		// TODO Auto-generated constructor stub
	}
		
	
	/*public Chapter(String title, int duration, short year) {
		super();
		this.title = title;
		this.duration = duration;
		this.year = year;
	}*/
	
	
	public int getId() {
		return id;
	}
	
	public int getSessionNumber() {
		return sessionNumber;
	}
	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}
	

}
