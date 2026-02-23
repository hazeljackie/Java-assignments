//JACQUELINE GITONGA
//CT100/21937/24


import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random rand = new Random();
        int secretNumber = rand.nextInt(20) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Guess the number between 1 and 20:");

        try (Scanner Input = new Scanner(System.in)) {
            while (guess != secretNumber) {
                System.out.print("Enter your guess: ");
                guess = Input.nextInt();
                attempts++;

                if (guess > secretNumber) {
                    System.out.println("Too high!");
                } else if (guess < secretNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Congratulations! You guessed the number.");
                }
            }

            System.out.println("Total attempts: " + attempts);
        }
    }
}
