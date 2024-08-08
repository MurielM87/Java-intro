package TP;

import java.util.Scanner;

public class TP_FactorielleDominique {
    public static long factorielle(int nombre){
        if (nombre < 0) {
            System.out.println("factorielle non définie");
            return -1;
        } else {
            long factorielle = nombre;
            for (int i = nombre - 1; i >= 1; i--){
                factorielle *= i;
            }
            return factorielle;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Entrez un entier : ");
        int nombre = kb.nextInt();
        long f = factorielle(nombre);
        if (f != -1) System.out.println("Factorielle de " + nombre + " : " + f);
    }
}
