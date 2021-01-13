package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class program {

	public static void main(String[] args) throws ParseException {
	 Scanner sc = new Scanner(System.in);
	 
	 
	 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	 
	 System.out.print("Room Number: ");
	 int number = sc.nextInt();
	 
	 System.out.println("Check-in date: ");
	 Date checkIn = sdf.parse(sc.next());
	 
	 
	 System.out.println("Check-out date: ");
	 Date checkOut = sdf.parse(sc.next());
	 
	 
	 
		 Reservation reservation = new Reservation(number, checkIn, checkOut);
		 
		 System.out.println("Reservation: " + reservation);
		 
		 System.out.println("Enter data to update the reservation: ");
		 System.out.print("Check-in date: ");
		 checkIn = sdf.parse(sc.next());
		 
		 System.out.print("Check-out date: ");
		 checkOut = sdf.parse(sc.next());
		 
		 
		 
		 String error = reservation.updateDates(checkIn, checkOut);
		
		 
		 if(error != null) {
			 
		 System.out.println("Error in reservation: " + error);
		 
		  
	 }
	 
		 else {
			 System.out.println(reservation);
		 }
	 	
	 	

	}

}
