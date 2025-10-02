package exercisesPart2;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		/*
		 * Mostrar título
		 * Mostar precio
		 * Introducir precio
		 * Mostar  impuesto
		 * Introducir impuesto
		 * Fijar precio a precio * (1 + impuesto/100)
		 * Mostrar precio nuevo
		 * Fin
		 */
		// Create new Scanner
				Scanner sc = new Scanner(System.in);
				
				//Create variables 
				float price; 
				int tax; 
				
				//Display program title
				System.out.println("Excersice1");
				
				//Display prompt for price 
				System.out.print("Enter the price: ");
				price = sc.nextFloat();
				
				//Display prompt for tax 
				System.out.print("Enter the tax: ");
				tax = sc.nextInt();
				
				//Set price to price * tax 
				price = price * (1+(tax/100.0f));		
				
				//Print result 
				System.out.println("The prices with taxes is: " + price );
				
				//Close Scanner
				sc.close();
			}

		}