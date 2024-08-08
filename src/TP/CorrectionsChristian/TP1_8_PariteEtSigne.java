package TP.CorrectionsChristian;

import java.util.Scanner;

public class TP1_8_PariteEtSigne {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");
        int nombre = keyboard.nextInt();

        String signe = switch (Integer.signum(nombre)) {
            case 1 -> "positif";
            case -1 -> "négatif";
            default -> "zéro";
        };

        String parite = (nombre % 2 == 0) ? "pair" : "impair";

        if (nombre == 0) {
            System.out.println("Le nombre est zéro (et il est pair)");
        } else {
            System.out.printf("Le nombre est %s et %s\n", signe, parite);
        }

        keyboard.close();
    }
}
