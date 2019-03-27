package com.blascode.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Serie extends Film {
	
	private int id;

//	private int timeViewed;
	private int sessionQuantity;
	private  ArrayList<Chapter> chapters;
	
	public Serie(String title, String genre, String creator, int duration , int sessionQuantity, ArrayList<Chapter> chapters) {
		super(title, genre, creator, duration);
		// TODO Auto-generated constructor stub		
		this.sessionQuantity =sessionQuantity;
		this.chapters = chapters;
	}


	public int getId() {
		return id;
	}


	public int getSessionQuantity() {
		return sessionQuantity;
	}


	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}


	public ArrayList<Chapter> getChapters() {
		return chapters;
	}


	public void setChapter(ArrayList<Chapter> chapters) {
		this.chapters = chapters;
	}

@Override
public String toString() {
	return "::: SERIE ::: "+
			"TITLE: "+ getTitle() + 
			"\n Genero: " + getGenre() + 
			"\n Genero: " + getYear() +
			"\n Creator: " + getCreator() +
			"\n Duration: " + getDuration();
}


public static ArrayList<Serie> makeSerieList(){
	ArrayList<Serie> series = new ArrayList();
		
	
	for (int i = 0; i <= 5; i++) {
/*		series.add(new Serie("Serie "+ i,"Genero "+ i,"Creador ", 120+i,5 ));*/
		series.add(new Serie("Serie "+i, "genero "+i, "creador "+i, 1200, 5, Chapter.makeChaptersList()));
	}	
	
	return series;
} 
	
}
