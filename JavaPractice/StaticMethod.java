package JavaPractice;

class TemperatureConverter {
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        double celsius = 25;
        double fahrenheit = 77;

        double fahrenheitResult = TemperatureConverter.celsiusToFahrenheit(celsius);
        double celsiusResult = TemperatureConverter.fahrenheitToCelsius(fahrenheit);

        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheitResult + " degrees Fahrenheit");
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsiusResult + " degrees Celsius");
    }
}

