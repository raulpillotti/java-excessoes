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
	 
	 
	 if(!checkOut.after(checkIn)) {
		 System.out.println("Error in reservation: check-in date must be before check-out date.");
	 }
	 
	 else {
		 Reservation reservation = new Reservation(number, checkIn, checkOut);
		 
		 System.out.println("Reservation: " + reservation);
		 
		 System.out.println("Enter data to update the reservation: ");
		 System.out.print("Check-in date: ");
		 checkIn = sdf.parse(sc.next());
		 
		 System.out.print("Check-out date: ");
		 checkOut = sdf.parse(sc.next());
		 
		 Date now = new Date();
		 
		 if(checkIn.before(now) || checkOut.before(now)) {
			 
			 System.out.println("Reservation date must be future dates.");
		 }
		 
		 else if(checkOut.before(checkIn)) {
			 System.out.println("Error in reservation: check-in date must be before check-out date.");
		 }
		 
		 else {
		 
		 reservation.updateDates(checkIn, checkOut);
		 
		 System.out.println("Reservation: " + reservation );
		 }
	 
	 }
	 	
	 	

	}

}
