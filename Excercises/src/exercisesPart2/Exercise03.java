package exercisesPart2;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		/*
		 *  Diseña un programa que pregunte al 
		 *  usuario sobre la anchura y el largo 
		 *  de un rectángulo y luego mostrar el 
		 *  área y perimetro
		 */
		
		// Create variable 
		double length;
		double height;
		double perimeter;
		double area; 
		
		// Create Scanner
		Scanner reader = new Scanner(System.in); 
		
		// Ask to the user for 
		System.out.println("What is the values for the length of a rectangle?");
		length = reader.nextDouble();
		
		System.out.println("What is the values for the height of a rectangle?");
		height = reader.nextDouble();
		
		// Calculate the area and perimeter of the rectangle 
		perimeter = (2 * length) + (2 * height);
		area = length * height;
		
		// Display to the user the area and perimeter of the rectangle
		System.out.println("Your rectangle perimeter is: " + perimeter);
		System.out.println("Your rectangle area is: " + area);
		// Close Scanner
		reader.close();
	}

}
