package TP;

import java.util.Scanner;

public class TP_NombreParfait_V3 {
    public static boolean estNombreParfait(int nombre){
        int somme = 0;
        for (int i = 1; i < nombre; i++){
            if (nombre % i == 0) somme += i;
        }
        return nombre == somme;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Entrez un nombre entier positif : ");
        int nombre = kb.nextInt();

        if (estNombreParfait(nombre)){
            System.out.println(nombre + " est un nombre parfait!");
        } else {
            System.out.println(nombre + " n'est pas parfait :-(");
        }
    }
}
