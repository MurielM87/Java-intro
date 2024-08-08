package TP;

import java.util.Scanner;

public class TP_ConvertisseurTemperatureCharles {
    public static int celsiusVersfahrenheit(int tEnCelsius){
        return (tEnCelsius * 9 / 5 + 32);
    }

    public static int fahrenheitVersCelsius(int tEnFahrenheit){
        return ((tEnFahrenheit - 32) * 5 / 9);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Entrez une température (sous forme 32C ou 20F) : ");
        String input = kb.next();
        int temperature = Integer.parseInt(input.substring(0, input.length() - 1));
        char unite = input.charAt(input.length() - 1);
        if (unite == 'F') {
            System.out.println(fahrenheitVersCelsius(temperature) + "C");
        } else if (unite == 'C') {
            System.out.println(celsiusVersfahrenheit(temperature) + "F");
        }
    }
}
