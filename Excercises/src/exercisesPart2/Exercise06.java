package exercisesPart2;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		/*
		 * Craer un programa en el que introduzca que 
		 * organice grupos. Es decir, introducir cuantos 
		 * estudiantes son, cuantos grupos necesitan hacer y 
		 * muestre: cantidad de alumno en cada grupo y 
		 * los estudiantes que faltan por tener grupo. 
		 */

		// Create variable
		int numberOfStudent;
		int numberOfGroup;
		int rest;
		int numberOfMemberInAGroup;
		
		// Create Scanner
		Scanner reader = new Scanner(System.in);
		
		// Ask for the number of students that there are in the user class and the number of group that the teacher wants the students to make
		System.out.println("How many students there are in your class?");
		numberOfStudent = reader.nextInt();
		
		System.out.println("How many groups does the teacher want the students to make?");
		numberOfGroup = reader.nextInt();
		
		// Calculate the number of group, number of member
		numberOfMemberInAGroup = (int) numberOfStudent / numberOfGroup;
		rest =  numberOfStudent - (numberOfGroup * numberOfMemberInAGroup);
		
		// Display the number of member that they are in a group and the rest of student that don't have group
		System.out.println("The number of member in every group are: " + numberOfMemberInAGroup);
		System.out.println("The number of surplus students are: " + rest);
		
		// Close Scanner
		reader.close();
	}

}
