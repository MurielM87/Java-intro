package TP;

import java.util.ArrayList;
import java.util.Scanner;

public class TP_RechercheNombre {
    // Exemple d'exécution : tableau saisi à partir du clavier : 12,45,6,7,12,23,33,6,22,3,6
    //->Entrer un nombre à rechercher : 6
    //->6 existe et se retrouve 3 fois dans le tableau
    public static ArrayList<Integer> saisieTableau() {
        ArrayList<Integer> tableau = new ArrayList<>();
        Scanner kb = new Scanner(System.in);
        String input;
        do {
            System.out.print("Entrez un entier ou stop : ");
            input = kb.nextLine();

            if (!input.equals("stop")) {
                tableau.add(Integer.parseInt(input));
            }
        } while (!input.equals("stop"));


        return tableau;
    }

    public static int rechercheValeur(int valeur, ArrayList<Integer> tableau) {
        int occurences = 0;

        for (int entree : tableau) if (entree == valeur) occurences++;
        return occurences;
    }

    public static void main(String[] args) {
        int valeur, occurences;
        Scanner kb = new Scanner(System.in);

        ArrayList<Integer> tableau = saisieTableau();
        do {
            System.out.print("Entrez une valeur à rechercher (-1 pour quitter) : ");
            valeur = kb.nextInt();
            if (valeur != -1) {
                occurences = rechercheValeur(valeur, tableau);
                if (occurences == 0) {
                    System.out.println("La valeur n'est pas dans le tableau");
                } else {
                    System.out.println("La valeur apparait " + occurences + "x dans le tableau");
                }
            }
        } while (valeur != -1);
    }
}

