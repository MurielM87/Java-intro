package TP.CorrectionsChristian;

import java.util.Scanner;

public class TP1_9_NomMois {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Mois : ");
        int mois = keyboard.nextInt();

        String nomMois = switch (mois) {
            case 1 -> "Janvier";
            case 2 -> "Février";
            case 3 -> "Mars";
            case 4 -> "Avril";
            case 5 -> "Mai";
            case 6 -> "Juin";
            case 7 -> "Juillet";
            case 8 -> "Août";
            case 9 -> "Septembre";
            case 10 -> "Octobre";
            case 11 -> "Novembre";
            case 12 -> "Décembre";
            default -> "Mois invalide";
        };

        System.out.println("Résultat : " + nomMois);

        keyboard.close();
    }
}

