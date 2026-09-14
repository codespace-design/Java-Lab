package level2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadUntilValidFile {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            BufferedReader reader = null;
            while (reader == null) {
                System.out.print("Enter a valid file name: ");
                try {
                    reader = new BufferedReader(new FileReader(PathInput.clean(input.nextLine())));
                } catch (FileNotFoundException exception) {
                    System.out.println("File not found. Try again.");
                }
            }
            try (BufferedReader file = reader) {
                String line;
                int count = 0;
                while (count < 5 && (line = file.readLine()) != null) {
                    System.out.println(line);
                    count++;
                }
            } catch (IOException exception) {
                System.out.println("Error reading file: " + exception.getMessage());
            }
        }
    }
}
