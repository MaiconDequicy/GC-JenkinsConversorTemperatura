public class Conversor {

    public static double fahrenheitParaCelsius(double fahrenheit) {
        System.out.println("Convertendo " + fahrenheit + " F para Celsius...");
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Resultado: " + celsius + " C");
        return celsius;
    }

    public static double celsiusParaFahrenheit(double celsius) {
        System.out.println("Convertendo " + celsius + " C para Fahrenheit...");
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Resultado: " + fahrenheit + " F");
        return fahrenheit;
    }

    public static void main(String[] args) {
        double fahrenheit = 82;
        double celsius = 32;

        System.out.println(fahrenheit + " F é igual a " + fahrenheitParaCelsius(fahrenheit) + " C");
        System.out.println(celsius + " C é igual a " + celsiusParaFahrenheit(celsius) + " F");
    }
}
