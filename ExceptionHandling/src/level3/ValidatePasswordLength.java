package level3;

import java.util.Scanner;

public class ValidatePasswordLength {
    static void validate(String password) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password must contain at least eight characters.");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter password: ");
            validate(scanner.nextLine());
            System.out.println("Password length is valid.");
        } catch (IllegalArgumentException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
