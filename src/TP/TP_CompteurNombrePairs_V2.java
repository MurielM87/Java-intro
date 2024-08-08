package TP;

import java.util.Arrays;
import java.util.Scanner;

public class TP_CompteurNombrePairs_V2 {
    public static int nombresPairsTableau(int[] tableau){
        int pairs = 0;

        for (int nombre: tableau){
            if (nombre % 2 == 0) pairs++;
        }

        return (pairs);
    }

    public static void main(String[] args) {
        int[] tableauDeNombres = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Il y a dans le tableau " + Arrays.toString(tableauDeNombres) + " : " + nombresPairsTableau(tableauDeNombres) + " nombres pairs");
    }
}
