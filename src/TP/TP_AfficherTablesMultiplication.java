package TP;

import java.util.Scanner;
//écrire un programme Tables.java : afficher les tables de multiplication de 2 à 10
public class TP_AfficherTablesMultiplication {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int nombreFinal;
        int nombre;
        for(nombreFinal = 2; nombreFinal <= 10; nombreFinal++) {
            System.out.print("\ntable de " +nombreFinal+ " : \n" );
            for(nombre = 1; nombre <= 10; nombre++) {
                System.out.print(nombre + " x " + nombreFinal + " = " + nombre * nombreFinal + "\n");
            }
        }
    }
}
