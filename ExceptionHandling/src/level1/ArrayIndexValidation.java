package level1;

import java.util.Scanner;

public class ArrayIndexValidation {
    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40, 50};
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an index (0-4): ");
            int index = scanner.nextInt();
            System.out.println("Element: " + values[index]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Error: index must be between 0 and 4.");
        }
    }
}
