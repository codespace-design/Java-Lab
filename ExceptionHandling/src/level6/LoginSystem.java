package level6;

import java.util.Scanner;

public class LoginSystem {
    static void authenticate(String username, String password) throws Exception {
        if (!"admin".equals(username) || !"java123".equals(password)) {
            throw new Exception("All login attempts failed.");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean loggedIn = false;
            for (int attempt = 1; attempt <= 3; attempt++) {
                System.out.print("Username: ");
                String username = scanner.nextLine();
                System.out.print("Password: ");
                String password = scanner.nextLine();
                if ("admin".equals(username) && "java123".equals(password)) {
                    loggedIn = true;
                    break;
                }
                System.out.println("Invalid credentials. Attempts left: " + (3 - attempt));
            }
            if (!loggedIn) authenticate("", "");
            System.out.println("Login successful.");
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
