package level2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyAFile {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter source file: ");
            String source = PathInput.clean(input.nextLine());
            System.out.print("Enter destination file: ");
            String destination = PathInput.clean(input.nextLine());
            try (FileInputStream reader = new FileInputStream(source);
                 FileOutputStream writer = new FileOutputStream(destination)) {
                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = reader.read(buffer)) != -1) {
                    writer.write(buffer, 0, bytesRead);
                }
                System.out.println("File copied successfully.");
            } catch (IOException exception) {
                System.out.println("Error copying file: " + exception.getMessage());
            }
        }
    }
}
