package TP.CorrectionsChristian;

import java.util.Scanner;

public class TP1_2_CalculSurface {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entrez le diamètre du cercle : ");
        double diametre = keyboard.nextDouble();
        double rayon = diametre / 2;
        double surface = Math.pow(rayon,2) * Math.PI;
        System.out.printf("La surface du cercle est : %.2f\n", surface);
        keyboard.close();
    }
}
