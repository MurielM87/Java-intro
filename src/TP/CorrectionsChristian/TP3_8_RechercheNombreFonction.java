package TP.CorrectionsChristian;

import java.util.Scanner;

public class TP3_8_RechercheNombreFonction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tableau = lireTableau(scanner);
        int recherche = lireNombreRecherche(scanner);

        int compte = compterOccurrences(tableau, recherche);

        afficherResultat(recherche, compte);
    }

    public static int[] lireTableau(Scanner scanner) {
        System.out.println("Entrez les nombres du tableau séparés par des virgules :");
        String[] input = scanner.nextLine().split(",");
        int[] tableau = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            tableau[i] = Integer.parseInt(input[i].trim());
        }
        return tableau;
    }

    public static int lireNombreRecherche(Scanner scanner) {
        System.out.println("Entrez un nombre à rechercher :");
        return scanner.nextInt();
    }

    public static int compterOccurrences(int[] tableau, int recherche) {
        int compte = 0;
        for (int nombre : tableau) {
            if (nombre == recherche) {
                compte++;
            }
        }
        return compte;
    }

    public static void afficherResultat(int recherche, int compte) {
        if (compte > 0) {
            System.out.printf("%d existe et se retrouve %d fois dans le tableau\n", recherche, compte);
        } else {
            System.out.printf("%d n'existe pas dans le tableau\n", recherche);
        }
    }
}
