package level1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidIntegerInput {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            System.out.println("You entered: " + scanner.nextInt());
        } catch (InputMismatchException exception) {
            System.out.println("Error: please enter a valid integer.");
        }
    }
}
