package TP;

public class TP_ConvertisseurTemperature {
    //convertir celsius en fahrenheit celsiusVersfahrenheit(double celsius)
    public static double celsiusVersFahrenheit(double fahrenheit) {
        //formule: C=(F-32)*5/9
        double celsius = (fahrenheit - 32) * (5 / 9);
        return celsius;
    }

    //convertir fahrenheit en celsius fahrenheitVersCelsius(double celsius)
    public static double fahrenheitVersCelsius(double celsius) {
        //formule: F = C * 9/5 + 32
        double fahrenheit = (celsius * (9 / 5) + 32);
        return fahrenheit;
    }

    public static void main(String[] args) {
        System.out.print(fahrenheitVersCelsius(20) + "°C \n");
        System.out.print(celsiusVersFahrenheit(68) + "°F");
    }
}
