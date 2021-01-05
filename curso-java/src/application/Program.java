package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservetion;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Room number: ");
		int number = sc.nextInt();
		System.out.println("Check-in date (dd/mm/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Check-Out date (dd/mm/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		if (!checkOut.after(checkIn)) {
			System.out.println("error!! IN RESERVATION: CHECK-OUT DATE MUST BE AFTER CHECK-IN DATE ");
		}else {
			Reservetion reservetion = new Reservetion(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservetion);
			
			System.out.println();
			System.out.println("ENTER DATE UPTADE THE RESERVATION: ");
			System.out.println("Check-in date (dd/mm/yyyy): ");
			 checkIn = sdf.parse(sc.next());
			System.out.println("Check-Out date (dd/mm/yyyy): ");
			 checkOut = sdf.parse(sc.next());
			 
				    
			 
			      String error = reservetion.updateDates(checkIn, checkOut);
			      if(error != null ) {
			    	 System.out.println("error reservation : " + error);
			    	 
			      }else {	  
					System.out.println("reservation: " + reservetion);
					
			      }
					
			 
			 
			
		}
		
		
		
		
		
		sc.close();

	}

}
