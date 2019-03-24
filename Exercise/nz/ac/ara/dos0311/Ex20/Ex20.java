package nz.ac.ara.dos0311.Ex20;

import java.util.Scanner;

public class Ex20 {
	public void GradeStatistics(int numOfStudents) {
		int[] grades = new int[numOfStudents];
		int grade = 0;
		int i = 0;
		int j = 0;
		double total = 0;
		double average = 0;
		double std = 0;
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
		
		while (j < numOfStudents) {
			std += (grades[j] * grades[j]) - (average * average);
			j++;
		}
		
		std = Math.sqrt(std / (double)numOfStudents);
		
		System.out.println("The average is " + average);
		System.out.println("The minimum is " + this.getMinValue(grades));
		System.out.println("The Maximum is " + this.getMaxValue(grades));
		System.out.println("The standard deviation is " + std);
	}
	
	public int getMaxValue(int[] array) {
      int max = 0;
     
      for(int i=0; i<array.length; i++ ) {
         if(array[i]>max) {
            max = array[i];
         }
      }
      return max;
   }
   public int getMinValue(int[] array) {
      int min = array[0];
     
      for(int i=0; i<array.length; i++ ) {
         if(array[i]<min) {
            min = array[i];
         }
      }
      return min;
   }
}
