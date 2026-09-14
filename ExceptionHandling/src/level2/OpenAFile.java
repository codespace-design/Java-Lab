package level2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OpenAFile {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter file name: ");
            String fileName = PathInput.clean(input.nextLine());
            try (Scanner file = new Scanner(new File(fileName))) {
                while (file.hasNextLine()) {
                    System.out.println(file.nextLine());
                }
            } catch (FileNotFoundException exception) {
                System.out.println("Error: file was not found.");
            }
        }
    }
}
