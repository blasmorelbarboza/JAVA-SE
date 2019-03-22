package com.blascode.amazonviewer.model;

import java.util.Date;


public class Magazine extends Publication {
	
	private int id;

	
	public Magazine(String title, Date edititionDate, String editorial ) {
		super(title, edititionDate, editorial );
		// TODO Auto-generated constructor stub
	}

	
	/*public Magazine(String title, Date edititionDate, String editorial) {
		super();
		this.title = title;
		this.edititionDate = edititionDate;
		this.editorial = editorial;
	}*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

@Override
public String toString() {
	return "::: MAGAZINE ::: "+
	"TITLE: "+ getTitle() ;
}	
	
}
