package level5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {
        double balance = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("1. Deposit  2. Withdraw  3. Balance enquiry\nChoose: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Deposit amount: ");
                    double amount = scanner.nextDouble();
                    if (amount < 0) throw new IllegalArgumentException("Amount cannot be negative.");
                    balance += amount;
                }
                case 2 -> {
                    System.out.print("Withdrawal amount: ");
                    double amount = scanner.nextDouble();
                    if (amount < 0) throw new IllegalArgumentException("Amount cannot be negative.");
                    if (amount > balance) throw new IllegalArgumentException("Insufficient balance.");
                    balance -= amount;
                }
                case 3 -> { }
                default -> throw new IllegalArgumentException("Invalid menu choice.");
            }
            System.out.println("Balance: " + balance);
        } catch (InputMismatchException exception) {
            System.out.println("Error: enter valid numeric input.");
        } catch (IllegalArgumentException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
