package level5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentResultValidator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double total = 0;
            for (int subject = 1; subject <= 5; subject++) {
                System.out.print("Enter marks for subject " + subject + " (0-100): ");
                double marks = scanner.nextDouble();
                if (marks < 0 || marks > 100) {
                    throw new IllegalArgumentException("Marks must be between 0 and 100.");
                }
                total += marks;
            }
            System.out.println("Average: " + total / 5);
        } catch (InputMismatchException exception) {
            System.out.println("Error: every mark must be numeric.");
        } catch (IllegalArgumentException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
