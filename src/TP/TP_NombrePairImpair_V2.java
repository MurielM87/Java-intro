package TP;

import java.util.Scanner;

public class TP_NombrePairImpair_V2 {
    public static boolean estPair(int nombre){
        return (nombre%2 == 0);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Entrez un entier positif : ");
        int nombre = kb.nextInt();

        if (estPair(nombre)){
            System.out.println(nombre + " : pair");
        } else {
            System.out.println(nombre + " : impair");
        }
    }
}
