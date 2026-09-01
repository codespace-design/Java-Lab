public class program13 {
    static class Circle {
        double radius;
        double area;

        Circle(double radius) {
            this.radius = radius;
            this.area = Math.PI * radius * radius;
        }
    }

    static Circle computeCircle(double radius) {
        return new Circle(radius);
    }

    public static void main(String[] args) {
        Circle circle = computeCircle(7);
        System.out.println("Radius = " + circle.radius + " Area = " + String.format("%.2f", circle.area));
    }
}
