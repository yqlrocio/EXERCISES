package exercisesPart2;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		/*
		 * El Índice de Masa Corporal (IMC) de una persona 
		 * mide su peso en relación con su altura. Se calcula 
		 * de la siguiente manera: Dividir el peso de una 
		 * persona (en kg) entre el cuadrado de su altura (en metros).
		 * Diseñar un programa que permita al usuario introducir 
		 * su peso y altura, y luego imprimir su IMC.
		 */
		
		// Create variable
		double BMI; 
		double weight;
		double height;
		
		// Create Scanner
		Scanner reader = new Scanner(System.in);
		
		// Ask for the weight and height of the user
		System.out.println("what is your weight?");
		weight = reader.nextDouble(); 
		
		System.out.println("what is your height?");
		height = reader.nextDouble(); 
		
		// Calculate de IMC of the user
		BMI = weight / (height * height);
		
		//Display the IMC of the user
		System.out.println("Your individual's Body Mass Index is: " + BMI);
		
		//Close Scanner
		reader.close();
	}
}
