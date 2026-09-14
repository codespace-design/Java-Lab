package level4;

import java.util.Scanner;

public class LowAttendanceExceptionDemo {
    static void validate(double attendance) throws LowAttendanceException {
        if (attendance < 75) {
            throw new LowAttendanceException("Attendance must be at least 75%.");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter attendance percentage: ");
            validate(scanner.nextDouble());
            System.out.println("Attendance accepted.");
        } catch (LowAttendanceException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
