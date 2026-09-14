package level6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentRecordFile {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter student record file: ");
            try (BufferedReader reader = new BufferedReader(
                    new FileReader(level2.PathInput.clean(input.nextLine())))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] fields = line.split(",");
                    if (fields.length < 2) throw new InputMismatchException("Record needs name and mark.");
                    Integer.parseInt(fields[1].trim());
                    System.out.println("Name: " + fields[0].trim() + ", Mark: " + fields[1].trim());
                }
            } catch (IOException exception) {
                System.out.println("Error opening or reading file: " + exception.getMessage());
            } catch (NumberFormatException | InputMismatchException exception) {
                System.out.println("Error: invalid numeric student data.");
            }
        }
    }
}
