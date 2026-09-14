package level2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountLines {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter file name: ");
            String fileName = PathInput.clean(input.nextLine());
            int lines = 0;
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                while (reader.readLine() != null) {
                    lines++;
                }
                System.out.println("Number of lines: " + lines);
            } catch (IOException exception) {
                System.out.println("Error reading file: " + exception.getMessage());
            }
        }
    }
}
