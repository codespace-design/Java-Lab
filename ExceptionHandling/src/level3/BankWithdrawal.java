package level3;

import java.util.Scanner;

public class BankWithdrawal {
    static void withdraw(double balance, double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal cannot be negative.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Withdrawal exceeds available balance.");
        }
        System.out.println("Withdrawal approved. Remaining balance: " + (balance - amount));
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter balance: ");
            double balance = scanner.nextDouble();
            System.out.print("Enter withdrawal amount: ");
            withdraw(balance, scanner.nextDouble());
        } catch (IllegalArgumentException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
