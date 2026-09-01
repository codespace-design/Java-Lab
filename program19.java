public class program19 {
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        double celsius = 30;
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit = " + celsiusToFahrenheit(celsius));
    }
}
