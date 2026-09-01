public class program8 {
    static void display(int value) {
        System.out.println("Integer : " + value);
    }

    static void display(double value) {
        System.out.println("Double : " + value);
    }

    static void display(String value) {
        System.out.println("String : " + value);
    }

    public static void main(String[] args) {
        display(10);
        display(25.6);
        display("Java");
    }
}
