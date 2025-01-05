package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		
//		Generate a random number
		Random random = new Random();
		int randomNumber = random.nextInt(1, 100);
		
//		Test to make sure the randomNumber that is generated is inclusive
//		for (int i = 0; i < 100; i++) {
//			System.out.println(randomNumber.nextInt(1, 100));
//		}
		
//		Number of guesses
		int guesses = 0;

//		Collect the guesses from the user
		while (guesses < 5) {
			System.out.println("Pick a number between 1 and 100");
		
			Scanner scanner = new Scanner(System.in);
			String userGuess = scanner.next();
			int convertedGuess = Integer.parseInt(userGuess);

			
			guesses++;
		}
		
		System.out.println("The number to guess was: " + randomNumber);
		
	}

}
