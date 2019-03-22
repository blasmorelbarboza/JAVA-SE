package com.blascode.amazonviewer.model;

import java.util.Date;

public interface IVisualilizable {

	Date startToSee(Date dateI);
	void stopToSee(Date dateI, Date dateF);
}
