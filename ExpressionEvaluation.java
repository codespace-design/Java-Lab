import java.util.Scanner;

public class ExpressionEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        System.out.print("Enter value of d: ");
        int d = sc.nextInt();

        System.out.print("Enter value of e: ");
        int e = sc.nextInt();

        if (e != 0) {
            int result = a + b * c - d / e;
            System.out.println("Result = " + result);
        } else {
            System.out.println("Division by zero is not possible.");
        }

        sc.close();
    }
}