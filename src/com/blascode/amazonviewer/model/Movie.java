package com.blascode.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Movie extends Film implements IVisualilizable {
	private int id;
	private int timeViewed;

	public Movie(String title, String genre, String creator, int duration, short year) {
		super(title, genre, creator, duration);
		setYear(year);

	}

	public void showData() {
		// System.out.println("TITLE: " + this.title);
		// System.out.println("GENERO: " + this.genre);
		// System.out.println("A�O: " + this.year);

	}

	public int getId() {
		return id;
	}

	public int getTimeViewed() {
		return timeViewed;
	}

	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ":::MOVIE::: " + "TITLE: " + getTitle() + "\n Genero: " + getYear() + "\n Creator: " + getCreator()
				+ "\n Duration: " + getDuration();
	}

	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		
		if (dateI.getTime() < dateF.getTime()) {
			setTimeViewed((int)(dateF.getTime() - dateI.getTime()));
		}else {
			setTimeViewed(0);
		}
		
	}
	public static ArrayList<Movie> makeMoviesList(){
		ArrayList<Movie> movies = new ArrayList();
		
		
		
		for (int i = 0; i <= 5; i++) {
			movies.add(new Movie("Movie"+ i,"Genero"+ i,"Creador", 120+i,(short)(2017+i) ));			
		}
		
		
		return movies;
	} 
	
	
	
}
