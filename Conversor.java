
public class Conversor {

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        double fahrenheit = 82;
        double celsius = 32;

        System.out.println(fahrenheit + " F eh igual a " + fahrenheitParaCelsius(fahrenheit) + " C");
        System.out.println(celsius + " C eh igual a " + celsiusParaFahrenheit(celsius) + " F");

    }
}