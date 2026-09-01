public class program15 {
    static int sumOfNaturalNumbers(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfNaturalNumbers(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum = " + sumOfNaturalNumbers(n));
    }
}
