package level5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int target = new Random().nextInt(10) + 1;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Guess a number from 1 to 10: ");
            try {
                int guess = scanner.nextInt();
                System.out.println(guess == target ? "Correct!" : "Not this time. The number was " + target + ".");
            } catch (InputMismatchException exception) {
                System.out.println("Error: enter a numeric guess.");
            }
        }
    }
}
