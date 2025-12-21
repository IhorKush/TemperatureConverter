public class Main {

    private static final double CELSIUS_TO_FAHRENHEIT_FACTOR = 1.8;
    private static final int CELSIUS_TO_FAHRENHEIT_OFFSET = 32;

    private static final double FAHRENHEIT_TO_CELSIUS_FACTOR = 0.5 / 0.9;
    private static final int FAHRENHEIT_TO_CELSIUS_OFFSET = 32;

    public static void main(String[] args) {
        System.out.println("Temperature Converter app.");

        double fahrenheit = 90;
        double celsius = fahrenheitToCelsius(fahrenheit);

        System.out.println(fahrenheit + " fahrenheit = " + celsius + " celsius.");
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - FAHRENHEIT_TO_CELSIUS_OFFSET) * FAHRENHEIT_TO_CELSIUS_FACTOR;
    }
}
