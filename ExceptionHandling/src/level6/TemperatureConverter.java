package level6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter temperature: ");
            double temperature = scanner.nextDouble();
            System.out.print("Convert to (C)elsius or (F)ahrenheit: ");
            char unit = scanner.next().toUpperCase().charAt(0);
            if (unit == 'F') {
                System.out.println("Converted temperature: " + (temperature * 9 / 5 + 32) + " F");
            } else if (unit == 'C') {
                System.out.println("Converted temperature: " + ((temperature - 32) * 5 / 9) + " C");
            } else {
                throw new IllegalArgumentException("Choose C or F.");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Error: temperature must be numeric.");
        } catch (IllegalArgumentException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
