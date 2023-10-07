package com.ash.MovieBooking;


public class Movie extends Thread
{
	   static BookSeat b;
	 int seats;
	 public void run() {
		 b.bookseat(seats);
	 }
	 
	 public static void main(String[] args) {
		 b = new BookSeat();
		 
		 Movie ash = new Movie();
		 ash.seats = 7;
		 ash.start();
		 
		 Movie anki = new Movie();
		 anki.seats = 6;
		 anki.start();
		 
	}
}
