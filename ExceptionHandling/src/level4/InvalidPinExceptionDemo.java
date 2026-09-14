package level4;

import java.util.Scanner;

public class InvalidPinExceptionDemo {
    static void validate(String pin) throws InvalidPinException {
        if (!pin.matches("\\d{4}")) {
            throw new InvalidPinException("PIN must contain exactly four digits.");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter PIN: ");
            validate(scanner.nextLine());
            System.out.println("PIN accepted.");
        } catch (InvalidPinException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
