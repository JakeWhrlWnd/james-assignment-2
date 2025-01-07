package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		Scanner scanner = new Scanner(System.in);
		int guesses = 0;
		final int MAX_NUMBER_OF_GUESSES = 5;
		System.out.println("Pick a number between 1 and 100");
		
		while (guesses < MAX_NUMBER_OF_GUESSES) {
			int userGuess = Integer.parseInt(scanner.next());
			
			if (userGuess == randomNumber) {
				System.out.println("You win!");
				break;
			}
			
			if (userGuess < 1 || userGuess > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again.");
				continue;
			}
			
			if (userGuess < randomNumber) {
				System.out.println("Please, pick a higher number");
			} else {
				System.out.println("Please, pick a lower number");
			}
			guesses++;
		}
		
		if (guesses == MAX_NUMBER_OF_GUESSES) {
			System.out.println("You lose!\n" + "The number to guess was: " + randomNumber);
		}
		
		scanner.close();
	}

}
