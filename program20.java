public class program20 {
    static final double PI = 3.14159;

    static double areaOfCircle(double radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        double radius = 5;
        System.out.println("Radius: " + radius);
        System.out.println("Area = " + String.format("%.2f", areaOfCircle(radius)));
    }
}
