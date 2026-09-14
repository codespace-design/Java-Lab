package level5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double first = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double second = scanner.nextDouble();
            System.out.print("1. Add  2. Subtract  3. Multiply  4. Divide\nChoose: ");
            int choice = scanner.nextInt();
            double result;
            switch (choice) {
                case 1 -> result = first + second;
                case 2 -> result = first - second;
                case 3 -> result = first * second;
                case 4 -> {
                    if (second == 0) throw new ArithmeticException("Cannot divide by zero.");
                    result = first / second;
                }
                default -> throw new IllegalArgumentException("Invalid menu choice.");
            }
            System.out.println("Result: " + result);
        } catch (InputMismatchException exception) {
            System.out.println("Error: enter valid numeric input.");
        } catch (ArithmeticException | IllegalArgumentException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
