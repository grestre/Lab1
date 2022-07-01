/*
 * Class: CMSC203  
 Program: Lab 1
 Instructor: 
 Summary of Description: User enters information about movies
 Due Date: 6/30/22 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.

 */

import java.util.Scanner; 
/**
 * 
 * @author Geronimo Restrepo
 *
 */

//Task 1
public class MovieDriver 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); 
		Movie mov = new Movie(); 
		String movie, rating, choice;  
		String y = "y";
		String n = "n"; 
		int ticketsSold; 
		
		System.out.println("Enter the title of a movie: ");
		movie = sc.nextLine(); 
		mov.setTitle(movie);
		
		System.out.println("Enter the movie's rating: "); 
		rating = sc.nextLine();
		mov.setRating(rating);
		
		System.out.println("How many tickets were sold?: "); 
		ticketsSold = sc.nextInt(); 
		mov.setSoldTickets(ticketsSold); 
		
		System.out.println(mov);
		
		System.out.println("Do you want to enter another? (y or n)"); 
		choice = sc.nextLine();
		choice = sc.nextLine(); 
		
		while(choice.equalsIgnoreCase(y))
		{
			System.out.println("Enter the title of a movie: ");
			movie = sc.nextLine(); 
			mov.setTitle(movie);
			
			System.out.println("Enter the movie's rating: "); 
			rating = sc.nextLine();
			mov.setRating(rating);
			
			System.out.println("How many tickets were sold?: "); 
			ticketsSold = sc.nextInt(); 
			mov.setSoldTickets(ticketsSold); 
			
			System.out.println(mov);
			
			System.out.println("Do you want to enter another? (y or n)"); 
			choice = sc.nextLine();
			choice = sc.nextLine(); 
		}
		System.out.println("Goodbye"); 
		System.out.println("Programmer: Geronimo Restrepo"); 
	}
}
