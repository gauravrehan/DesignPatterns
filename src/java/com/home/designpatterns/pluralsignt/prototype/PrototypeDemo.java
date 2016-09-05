package com.home.designpatterns.pluralsignt.prototype;

public class PrototypeDemo {

	public static void main(String a[])
	{
		Registry registry = new Registry();
		
		Movie movie = (Movie) registry.createItem("Movie");
		movie.setTitle("Creational Patterns in Java");
		System.out.println(movie);
		
		Movie anotherMovie = (Movie) registry.createItem("Movie");
		anotherMovie.setTitle("Gang of Four");
		System.out.println(anotherMovie);
		
	}
}
