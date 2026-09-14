package level1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionHandling {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] values = new int[2];
            System.out.print("Enter first integer: ");
            values[0] = scanner.nextInt();
            System.out.print("Enter second integer: ");
            values[1] = scanner.nextInt();
            System.out.println("Division: " + values[0] / values[1]);
            System.out.println("Third element: " + values[2]);
        } catch (InputMismatchException exception) {
            System.out.println("Error: input must be an integer.");
        } catch (ArithmeticException exception) {
            System.out.println("Error: cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Error: the array has no third element.");
        }
    }
}
