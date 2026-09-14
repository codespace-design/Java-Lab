package level6;

import java.util.Scanner;

public class LibraryFineCalculator {
    static int calculateFine(int overdueDays) {
        if (overdueDays < 0) {
            throw new IllegalArgumentException("Overdue days cannot be negative.");
        }
        if (overdueDays <= 5) return overdueDays * 2;
        if (overdueDays <= 10) return 10 + (overdueDays - 5) * 3;
        return 25 + (overdueDays - 10) * 5;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter overdue days: ");
            System.out.println("Fine: " + calculateFine(scanner.nextInt()));
        } catch (IllegalArgumentException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
