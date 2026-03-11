package com.myproject;

public class MovieBahubali {
	
	String movie;
	String director;
	String producer;
	String hero;
	String heroni1;
	String heroni2;
	double budget;
	
	MovieBahubali () {
		System.out.println("No-arg Movie Constructor");
	}
	
	MovieBahubali (String movie,String director,String producer,String hero,String heroni1,String heroni2,double budget) {
		this();
		this.movie = movie;
		this.director = director;
		this.producer = producer;
		this.hero = hero;
		this.heroni1 = heroni1;
		this.heroni2 = heroni2;
		this.budget = budget;
	}
	
	MovieBahubali (String movie,MovieBahubali m) { 
		this(m.movie,m.director,m.producer,m.hero,m.heroni1,m.heroni2,m.budget);
		this.movie = movie;
	}
	public static void main(String[] args) {
		MovieBahubali b1 = new MovieBahubali();
		b1.details();
		
		MovieBahubali b2 = new MovieBahubali("Bahubali part1","Rajmouli","Tilak","Prabhas","Anuskha","Thammana",50000000.00);
		b2.details();
		MovieBahubali b3 = new MovieBahubali("Bahubali part2", b2);
		b3.details();
		
	}
	
	
	void details () {
		System.out.println("Movie Name is 	:  " + movie);
		System.out.println("director Name is : " + director);
		System.out.println("Producer Name is :  " + producer);
		System.out.println("Hero Name is 	:  " + hero);
		System.out.println("Heroine Name is 	: " + heroni1);
		System.out.println("Heroine Name is 	: " + heroni2);
		System.out.println("Movie Budget is 	: " + budget);
		System.out.println("*******************************");
	}

}
