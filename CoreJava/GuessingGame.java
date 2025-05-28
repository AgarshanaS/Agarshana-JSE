package CoreJava;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String args[]){
        //Guessing Game
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(100) + 1; // Generates number between 1 and 100
        int guess = 0;

        System.out.println("Guess a number between 1 and 100:");

        while (guess != targetNumber) {
        System.out.print("Enter your guess: ");
        guess = scanner.nextInt();

        if (guess < targetNumber) {
        System.out.println("Too low! Try again.");
        } else if (guess > targetNumber) {
        System.out.println("Too high! Try again.");
        } else {
        System.out.println("Congratulations! You guessed the correct number.");
        }
        }
        scanner.close();
    }
}
