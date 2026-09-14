package level6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ElectricityBillGenerator {
    static double calculateBill(int units) {
        if (units < 0) throw new IllegalArgumentException("Units cannot be negative.");
        if (units <= 100) return units * 1.50;
        if (units <= 200) return 150 + (units - 100) * 2.50;
        return 400 + (units - 200) * 4.00;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter units consumed: ");
            System.out.println("Electricity bill: " + calculateBill(scanner.nextInt()));
        } catch (InputMismatchException exception) {
            System.out.println("Error: units must be an integer.");
        } catch (IllegalArgumentException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
