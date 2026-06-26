import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Rate: ");
        double rate = sc.nextDouble();
        System.out.print("Time: ");
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest= " + simpleInterest);
        System.out.println("Total Amount= " + (simpleInterest + principal));
        
        sc.close();
    }
    
}
