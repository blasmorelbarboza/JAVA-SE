package com.blascode.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Chapter extends Movie  {
	
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

	public static ArrayList<Chapter> makeChaptersList() {
		ArrayList<Chapter> chapters = new ArrayList();
		
		for (int i = 1; i <= 5; i++) {
			chapters.add(new Chapter("Capituo "+i, "genero "+i, "creator" +i, 45, (short)(2017+i), i));
		}
		
		return chapters;
	}
 
}
