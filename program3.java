import java.util.Scanner;

class Rectangle {
    // Consrtructor overloading
    public Rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        double area = length * width;
        System.out.println("Area of rectangle: " + area);
    }

    public Rectangle(double length, double width) {
        double area = length * width;
        System.out.println("Area of rectangle: " + area);
    }
}

public class program3 {
    public static void main(String[] args) {
        // Using default constructor
        Rectangle rectangle1 = new Rectangle();

        // Using parameterized constructor
        Rectangle rectangle2 = new Rectangle(5.0, 3.0);

    }
    
}
