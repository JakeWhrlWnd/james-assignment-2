package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		
//		Generate a random number
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		
//		Scanner instance for user guess
		Scanner scanner = new Scanner(System.in);
		
//		Number of guesses
		int guesses = 0;

//		Collect the guesses from the user
		while (guesses < 5) {
			System.out.println("Pick a number between 1 and 100");
			
//			Moved the scanner instance out, changed from a String conversion to int input
//			String userGuess = scanner.next();
//			int convertedGuess = Integer.parseInt(userGuess);
			int userGuess = Integer.parseInt(scanner.next());
			
			if (userGuess < 1 || userGuess > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again.");
			} else if (userGuess < randomNumber) {
				System.out.println("Please, pick a higher number");
				guesses++;
			} else if (userGuess > randomNumber) {
				System.out.println("Please, pick a lower number");
				guesses++;
			} else {
				System.out.println("You win!");
				break; // Break statement to end the loop when the random number is guessed
			}
			
//			Moved outside of the loop
//			if (guesses == 5 && userGuess != randomNumber) {
//				System.out.println("You lose!");
//			} else if (userGuess == randomNumber) {
//				System.out.println("You win!");
//			}

		}
		
		if (guesses == 5) {
			System.out.println("You lose!\n"
					+ "The number to guess was: " + randomNumber);
		} else {
			System.out.println("The number to guess was: " + randomNumber);
		}
		
	}

}
