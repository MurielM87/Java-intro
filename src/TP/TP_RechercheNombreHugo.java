package TP;

import java.util.ArrayList;
import java.util.Scanner;

public class TP_RechercheNombreHugo {
    public static void main(String[] args) {
        int lesValeurs = demandeNombre();

        if (lesValeurs == 0) {
            System.out.println("Il n'y a aucunes occurences du nombre recherché");
        }
        else {
            System.out.println("Nombre d'occurences du nombre : " + lesValeurs);
        }
    }

    public static int rechercheNombre(int num, ArrayList<Integer> tab) {
        int nbValeurs = 0;

        for (int value : tab) {
            if (value == num) {
                nbValeurs++;
            }
        }

        return nbValeurs;
    }

    public static int demandeNombre() {
        int values = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Entrez le nombre de valeur qu'il y aura dans le tableau : ");
        int nbValeurs = scan.nextInt();

        while (nbValeurs < 0) {
            System.out.println("Vous devez entrer une valeur positive");
            System.out.print("Entrez le nombre de valeur qu'il y aura dans le tableau : ");

            nbValeurs = scan.nextInt();
        }

        ArrayList<Integer> nombres = new ArrayList<Integer>();

        for (int i = 0; i < nbValeurs; i ++) {
            System.out.print("Entrez le " + (i + 1) + " nombre : ");
            int currentNum = scan.nextInt();

            nombres.add(currentNum);
        }

        System.out.println("");
        System.out.print("Quelle valeur souhaitez vous chercher dans le tableau : ");
        int nombreRecherche = scan.nextInt();

        scan.close();

        values = rechercheNombre(nombreRecherche, nombres);

        return values;
    }
}
