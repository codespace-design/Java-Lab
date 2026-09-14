package level2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateAFile {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter file name: ");
            File file = new File(PathInput.clean(scanner.nextLine()));
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("The file already exists.");
            }
        } catch (IOException exception) {
            System.out.println("Error creating file: " + exception.getMessage());
        }
    }
}
