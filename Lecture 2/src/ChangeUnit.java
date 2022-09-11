public class ChangeUnit {

    public static double changeToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double changeToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        double celsius = 80;
        double fahrenheit = 32;
        double convertedCelsius = changeToFahrenheit(celsius);
        double convertedFahrenheit = changeToCelsius(fahrenheit);
        System.out.println(celsius + " degrees celsius equal " + convertedCelsius + " degrees fahrenheit.");
        System.out.println(fahrenheit + " degrees fahrenheit equal " + convertedFahrenheit + " degrees celsius.");
    }
}