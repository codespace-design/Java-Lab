package level5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeAgeValidator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter employee age: ");
            int age = scanner.nextInt();
            if (age < 18 || age > 60) {
                throw new IllegalArgumentException("Employee age must be between 18 and 60.");
            }
            System.out.println("Accepted employee: " + name);
        } catch (InputMismatchException exception) {
            System.out.println("Error: age must be an integer.");
        } catch (IllegalArgumentException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
