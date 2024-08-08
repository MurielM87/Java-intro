package TP;

import java.util.Scanner;

public class TP_InversionChiffres {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //inversion des chiffres
        //saisi un nombre entier
        System.out.print("Entrez un nombre positif : ");
        int nombreEntier = keyboard.nextInt();
        System.out.printf("le nombre choisi est " + nombreEntier + "\n");
        int nombreRenverse = 0;
        //afficher l'inverse
        while(nombreEntier != 0) {
            int tmp = nombreEntier % 10;
            nombreRenverse = nombreRenverse * 10 + tmp;
            nombreEntier = nombreEntier / 10;
        }
        System.out.println("le nombre renversé est " +nombreRenverse);

    }
}

