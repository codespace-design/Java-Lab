package level4;

import java.util.Scanner;

public class InvalidSalaryExceptionDemo {
    static void validate(double salary) throws InvalidSalaryException {
        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be less than zero.");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter salary: ");
            validate(scanner.nextDouble());
            System.out.println("Salary accepted.");
        } catch (InvalidSalaryException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
