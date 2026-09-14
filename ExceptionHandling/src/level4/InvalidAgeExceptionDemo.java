package level4;

import java.util.Scanner;

public class InvalidAgeExceptionDemo {
    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18.");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter age: ");
            validate(scanner.nextInt());
            System.out.println("Age accepted.");
        } catch (InvalidAgeException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
