package level1;

import java.util.Scanner;

public class DivisionByZero {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();
            System.out.println("Result: " + numerator / denominator);
        } catch (ArithmeticException exception) {
            System.out.println("Error: denominator cannot be zero.");
        }
    }
}
