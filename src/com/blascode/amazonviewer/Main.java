package com.blascode.amazonviewer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.blascode.amazonviewer.model.Chapter;
import com.blascode.amazonviewer.model.Movie;
import com.blascode.amazonviewer.model.Serie;


public class Main {

	public static void main(String[] args) {
		System.out.println("Hola Gente");
	
		showMenu();
		
	}
	
	public static void showMenu()
	{
		int exit = 0;
		do {

			System.out.println("BIENVENIDOS AMAZON VIEWER");
			System.out.println("");
			System.out.println("Selecciona el número de la opción deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Exit");

			// Leer la respuesta del usuario
		Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());

			// int response = 1;
			switch (response) {
			case 0:
				// salir
				System.out.println("....¡¡SALISTE.. !!....");
				exit = 0;

				break;
			case 1:
				showMovies();
				break;
			case 2:
				showSeries();
				break;
			case 3:
				showBooks();
				break;
			case 4:
				showMagazines();
				break;
			case 5:
				makeReport();
				break;
			case 6:
				// Date date=new Date();
				makeReport(new Date());
				break;

			default:
				System.out.println();
				System.out.println("....¡¡Selecciona una opción!!....");
				System.out.println();
				break;
			}

		} while (exit != 0);

	} // FIN show Menu()
	
	public static void showMovies(){
		int exit=1;
		ArrayList<Movie> movies = Movie.makeMoviesList();
		
		do {
			System.out.println();
			System.out.println("::Movies::");
			System.out.println();
			
			for (int i = 0; i < movies.size(); i++) {
				System.out.println(i+1 +". "+ movies.get(i).getTitle() + " Visto: "+ movies.get(i).isViewed());			
			}		
			
			System.out.println("0. Regresar al Menu");
			System.out.println(" ");
	
			
			// leer respuesta Usuario para pelicula
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());

			
			if(response == 0) {
				showMenu();
			}     
			
			Movie movieSelected = movies.get(response-1);
			movieSelected.setViewed(true);
			Date dateI= movieSelected.startToSee(new Date());
			
			
			for (int i = 0; i < 10; i++) {			
				System.out.println(".;:._.;:._.;:.MOVIESSSSS_.;:._.;:._.;:.");
				}
			
			// termino verla
			 movieSelected.stopToSee(dateI, new Date());
			 System.out.println("Viste  ");
			 System.out.println(movieSelected);
			 System.out.println("por "+ movieSelected.getTimeViewed()+ "milisegundos" );
			 System.out.println("Viste  ");
						

		} while (exit !=0);
	}  // fin showMovies
	
	public static void showSeries(){
		int exit=1;
		ArrayList<Serie> series = Serie.makeSerieList();	
		do {
			System.out.println();
			System.out.println("::showSeries::");
			System.out.println();
			
			
			for (int i = 0; i < series.size(); i++) {
				System.out.println(i+1 +". "+ series.get(i).getTitle() + " Visto: "+ series.get(i).isViewed());			
			}
			
			
			System.out.println("0. Regresar al Menu");
			System.out.println(" ");
			
			// leer respuesta Usuario para SERIES
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
				showMenu();
			}
			
			showChapters(series.get(response-1).getChapters());
			//showChapters(series.get(response-1));
						

			
		} while (exit !=0);
	}
	public static void showChapters(ArrayList<Chapter> chaptersOfSerieSelected){
		int exit=0;
		do {
			System.out.println();
			System.out.println("::showChapters::");
			System.out.println();
			
			for (int i = 0; i < chaptersOfSerieSelected.size(); i++) { //1. Chapter 1
				System.out.println(i+1 + ". " + chaptersOfSerieSelected.get(i).getTitle() + " Visto: " + chaptersOfSerieSelected.get(i).isViewed());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
				showSeries();
			}
			
			Chapter chapterSelected = chaptersOfSerieSelected.get(response-1);
			chapterSelected.setViewed(true);
			Date dateI = chapterSelected.startToSee(new Date());
			
			for (int i = 0; i < 10; i++) {
				System.out.println(".;:._.;:._.;:.CAPITULOS_.;:._.;:._.;:.");
			}
			
			//Termine de verla
			chapterSelected.stopToSee(dateI, new Date());
			System.out.println();
			System.out.println("Viste: " + chapterSelected);
			System.out.println("Por: " + chapterSelected.getTimeViewed() + " milisegundos");
			
			/*
			Serie serieSelected = series.get(response-1);
			serieSelected.setViewed(true);
			Date dateI= serieSelected.startToSee(new Date());
			
			for (int i = 0; i < 10; i++) {				
				System.out.println(".;:._.;:._.;:.SERIESSSSS_.;:._.;:._.;:.");
			}
			
			// termino verla
			serieSelected.stopToSee(dateI, new Date());
			 System.out.println("Viste  ");
			 System.out.println(serieSelected);
			 //System.out.println("por "+ serieSelected.getTimeViewed()+ "milisegundos" );
			 System.out.println("Viste  ");*/
			
		} while (exit !=0);
	}
	public static void showBooks(){
		int exit=0;
		do {
			System.out.println();
			System.out.println("::showBooks::");
			System.out.println();
		} while (exit !=0);
	}
	public static void showMagazines(){
		int exit=0;
		do {
			System.out.println();
			System.out.println("::showMagazines::");
			System.out.println();
		} while (exit !=0);
	}
	
	public static void makeReport(){
		
	}
	public static void makeReport(Date date){
		
	}
	
}
