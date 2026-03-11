package com.myproject;

public class Movie {
	String director;
	String producer;
	String hero;
	String heroine;
	String movie;
	double budget;
	
	Movie () {
		System.out.println("no - arg Movie details");
	}
	
	Movie (String director, String producer) {
		this.director = director;
		this.producer = producer;
	}
	
	Movie (Movie m,String hero, String heroine) {
		this.hero = hero;
		this.heroine = heroine;
		this.director = m.director;
		this.producer = m.producer;
	}
	
	Movie (Movie m,String movie, double budget) {
		this.movie = movie;
		this.budget = budget;
		this.hero = m.hero;
		this.heroine = m.heroine;
		this.director = m.director;
		this.producer = m.producer;
	}
	
	public static void main(String[] args) {
		
		Movie m1 = new Movie();
		m1.showDetails();
		
		Movie m2 = new Movie("Rajkumar","Tilak");
		m2.showDetails();
		
		Movie m3 = new Movie(m2,"NTR","Priyanka");
		m3.showDetails();
		
		Movie m4 = new Movie(m3,"Dragon",20000000.00);
		m4.showDetails();
	}
	
	void showDetails() {
		System.out.println("Director Name is: " + director);
		System.out.println("Producer Name is: " + producer);
		System.out.println("Hero Name is    : " + hero);
		System.out.println("Heroine Name is : " + heroine);
		System.out.println("Movie Name is   : " + movie);
		System.out.println("Movie Budget is : " + budget);
		System.out.println("*******************************");
	}
}
