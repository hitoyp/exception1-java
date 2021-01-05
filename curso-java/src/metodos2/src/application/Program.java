package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
				System.out.println("Room number: ");
				int number = sc.nextInt();
				System.out.println("Check-in date (dd/mm/yyyy): ");
				Date checkIn = sdf.parse(sc.next());
				System.out.println("Check-Out date (dd/mm/yyyy): ");
				Date checkOut = sdf.parse(sc.next());
				
			
				Reservation reservetion = new Reservation(number, checkIn, checkOut);
				System.out.println("Reservation: " + reservetion);
				
				System.out.println();
				System.out.println("ENTER DATE UPTADE THE RESERVATION: ");
				System.out.println("Check-in date (dd/mm/yyyy): ");
				 checkIn = sdf.parse(sc.next());
				System.out.println("Check-Out date (dd/mm/yyyy): ");
				 checkOut = sdf.parse(sc.next());
				 
					    
				reservetion.updateDates(checkIn, checkOut);
				System.out.println("reservation: " + reservetion);
						
		}	
		
		catch(ParseException e) {
			System.out.println("Invalided date format");
		}
		catch(DomainException e) {
			System.out.println("error reservation: " + e.getMessage());
			
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
			
		}
					
			 
	  sc.close();


		
		

	}

}
