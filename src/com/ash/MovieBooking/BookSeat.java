package com.ash.MovieBooking;

public class BookSeat {
	
	int totalseats = 10;
	synchronized void bookseat(int seats) {
		if(totalseats>= seats) {
			System.out.println(seats+ " Seats Booked Successfully");
			totalseats = totalseats - seats;
			System.out.println("Seats Left :" +totalseats);
			
		}
		else {
			System.out.println("seats cannot be booked !!");
			System.out.println("seats left :" +totalseats);
		}
	}
}
 

