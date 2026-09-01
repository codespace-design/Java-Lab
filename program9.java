public class program9 {
    static int area(int side) {
        return side * side;
    }

    static int area(int length, int breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        int side = 6;
        int length = 8;
        int breadth = 4;

        System.out.println("Area of Square = " + area(side) + " Area of Rectangle = " + area(length, breadth));
    }
}
