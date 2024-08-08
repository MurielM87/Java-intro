package TP.CorrectionsChristian;

import java.util.Scanner;

public class TP3_8_RechercheNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez les nombres du tableau séparés par des virgules :");
        String[] input = scanner.nextLine().split(",");
        int[] tableau = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            tableau[i] = Integer.parseInt(input[i].trim());
        }

        System.out.println("Entrer un nombre à rechercher :");
        int recherche = scanner.nextInt();

        int compte = 0;
        for (int nombre : tableau) {
            if (nombre == recherche) compte++;
        }

        if (compte > 0) {
            System.out.printf("%d existe et se retrouve %d fois dans le tableau\n", recherche, compte);
        } else {
            System.out.printf("%d n'existe pas dans le tableau\n", recherche);
        }
    }
}
