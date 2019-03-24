package nz.ac.ara.dos0311.Ex22;

import java.util.Scanner;

public class Ex22 {
	public void NumberGuess() {
		int secretNumber = (int)(Math.random()*100);
		int trials = 0;
		int userInput = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Java NumberGuess");
		System.out.println("Key in your guess");
		userInput = Integer.parseInt(in.nextLine());
		trials++;
		while (userInput != secretNumber) { 
			if (userInput < secretNumber) {
				System.out.println("Try higher");
				userInput = Integer.parseInt(in.nextLine());
				trials++;
			} else{
				System.out.println("Try lower");
				userInput = Integer.parseInt(in.nextLine());
				trials++;
			}
		}
		
		System.out.println("You got it in " + trials + " trials !");
		
	}
}
