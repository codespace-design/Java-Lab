package level3;

import java.util.Scanner;

public class ValidateAge {
    static void validate(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18.");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter age: ");
            validate(scanner.nextInt());
            System.out.println("Age is valid.");
        } catch (IllegalArgumentException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
