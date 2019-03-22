package com.blascode.amazonviewer.model;

public class Chapter extends Movie {
	
	private int id;
	//private int timeViewed;
	private int sessionNumber;
	


		
	
	public Chapter(String title, String genre, String creator, int duration, short year, int sessionNumber) {
		super(title, genre, creator, duration, year);
		this.sessionNumber = sessionNumber;
	}
	/*public Chapter(String title, int duration, short year) {
		super();
		this.title = title;
		this.duration = duration;
		this.year = year;
	}*/
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public int getSessionNumber() {
		return sessionNumber;
	}
	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}
 @Override
public String toString() {
	// TODO Auto-generated method stub
	 return "::: CHAPTER ::: "+
		"TITLE: "+ getTitle() + 
		"\n Genero: " + getYear() +
		"\n Creator: " + getCreator() +
		"\n Duration: " + getDuration();
}	

}
