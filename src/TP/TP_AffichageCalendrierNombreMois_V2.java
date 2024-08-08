package TP;

import java.util.Scanner;

public class TP_AffichageCalendrierNombreMois_V2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entrez un nombre entre 1 et 12 : ");
        int mois = keyboard.nextInt();
        switch (mois) { //ancienne version - maintenant "->" sans break (voir point12)
            case 1 -> System.out.print("Janvier");
            case 2 -> System.out.print("Février");
            case 3 -> System.out.print("Mars");
            case 4 -> System.out.print("Avril");
            case 5 -> System.out.print("Mai");
            case 6 -> System.out.print("Juin");
            case 7 -> System.out.print("Juillet");
            case 8 -> System.out.print("Août");
            case 9 -> System.out.print("Septembre");
            case 10 -> System.out.print("Octobre");
            case 11 -> System.out.print("Novembre");
            case 12 -> System.out.print("Décembre");
            default -> System.out.print("ce nombre ne correspond à aucun mois");
        }
        ;
        keyboard.close();
    }
}
