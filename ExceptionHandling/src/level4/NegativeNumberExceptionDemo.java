package level4;

import java.util.Scanner;

public class NegativeNumberExceptionDemo {
    static void validate(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed.");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            validate(scanner.nextInt());
            System.out.println("Number accepted.");
        } catch (NegativeNumberException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
