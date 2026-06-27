import java.util.Scanner;

public class SwapNumbers {

    // Function 1: Swap using a temporary variable
    static void swapWithTemp(int a, int b) {
        System.out.println("\nSwap Using Temporary Variable");
        System.out.println("Before Swap");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }

    // Function 2: Swap without using a temporary variable
    static void swapWithoutTemp(int a, int b) {
        System.out.println("\nSwap Without Temporary Variable");
        System.out.println("Before Swap");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = sc.nextInt();

        System.out.print("Enter B: ");
        int b = sc.nextInt();

        swapWithTemp(a, b);
        swapWithoutTemp(a, b);

        sc.close();
    }
}