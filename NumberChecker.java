import java.util.Scanner;

public class NumberChecker {

    public static void checkOdd(int number) {
    if(number % 2 == 0) {
        System.out.println(number + " is even");
    } else {
        System.out.println(number + " is odd");
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        checkOdd(number);

        sc.close();
    }
    
    
}
