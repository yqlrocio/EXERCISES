package exercisesPart2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
	
	/*
	 * Establecer precio para implementar un programa 
	 * que solicita la edad del usuario y luego intenta 
	 * determinar el año en que nació el usuario  
	 */
	
	// Create variable
	int age; 
	int nowYear;
	int bornYear;
	
	
	// Create Scanner
	Scanner reader = new Scanner(System.in);
		
	// Ask to the user how old are he/she and what year the user is in 
	System.out.println("How old are?");
	age = reader.nextInt(); 
	
	System.out.println("What year are you now?");
	nowYear = reader.nextInt(); 
	
	// Calculate the year that the user has been born
	bornYear = (int) (nowYear - age); 
	
	// Display to the user the year that he/she born
	System.out.println("You were born in " + bornYear);

	// Close Scanner
	reader.close();
	}
}