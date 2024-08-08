package TP;

import java.util.Scanner;
//TP4 : factoriel
public class TP_Factoriel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //utilisateur entre un nombre
        System.out.println("Entrez un nombre : ");
        int nombre = keyboard.nextInt();
        int i;
        long factorielNombre = 1; //pas int, car grand chiffre
        //calcule et affiche la factorielle de ce nombre
        for(i = 1; i <= nombre; i++)
            factorielNombre = factorielNombre * i;
        System.out.print("Le factoriel de "+nombre+" est "+factorielNombre);
    }
}
