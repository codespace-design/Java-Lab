package level3;

import java.util.Scanner;

public class PositiveNumberChecker {
    static void validate(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative.");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            validate(scanner.nextInt());
            System.out.println("Number is valid.");
        } catch (IllegalArgumentException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
