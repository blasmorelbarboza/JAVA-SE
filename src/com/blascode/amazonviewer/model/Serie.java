package com.blascode.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Serie extends Film implements IVisualilizable{
	
	private int id;

//	private int timeViewed;
	private int sessionQuantity;
	private  ArrayList<Chapter> chapters;

	
	public Serie(String title, String genre, String creator, int duration , int sessionQuantity) {
		super(title, genre, creator, duration);
		// TODO Auto-generated constructor stub
		
		this.sessionQuantity =sessionQuantity;
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


	public ArrayList<Chapter> getChapter() {
		return chapters;
	}


	public void setChapter(ArrayList<Chapter> chapter) {
		this.chapters = chapter;
	}

@Override
public String toString() {
	return "::: SERIE ::: "+
			"TITLE: "+ getTitle() + 
			"\n Genero: " + getYear() +
			"\n Creator: " + getCreator() +
			"\n Duration: " + getDuration();
}


@Override
public Date startToSee(Date dateI) {
	// TODO Auto-generated method stub
	return null;
}


@Override
public void stopToSee(Date dateI, Date dateF) {
	// TODO Auto-generated method stub
	
}
	
}
