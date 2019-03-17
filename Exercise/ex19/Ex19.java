package ex19;

import java.util.Scanner;

public class Ex19 {
	public String GradesAverage(int numOfStudents) {
		int[] grades = new int[numOfStudents];
		int grade = 0;
		int i = 0;
		double total = 0;
		double average = 0;
		final int HIGHEST_GRADE = 100;
		final int LOWEST_GRADE = 0;
		
		Scanner in = new Scanner(System.in);
		
	
		while (i < numOfStudents) {
			System.out.println("Enter the grade for student " + (i+1));
			grade = Integer.parseInt(in.nextLine());
			
			if ((grade >= LOWEST_GRADE) && (grade <= HIGHEST_GRADE)) {
				grades[i] = grade;
				total += grade;
				i++;
				continue;
			} 
			System.out.println("Invalid grade, try again...");
				
		}
		
		average = total / (double)numOfStudents;
		
		return String.valueOf(average);
	}
}
