package TP;

import java.util.Scanner;
//TD5 : nombre parfait (28 est parfait, 6 aussi - pas 10)
public class TP_NombreParfait {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //verifier si l'utilisateur a entré un nombre et si c'est un nombre parfait (Un nombre parfait est un nombre entier positif qui est égal à la somme de ses diviseurs propres (diviseurs strictement inférieurs au nombre lui-même))
        //saisir un nombre entier positif
        System.out.print("Entrez un nombre positif : ");
        int nombreChoisi = keyboard.nextInt();
        System.out.printf("votre nombre est " + nombreChoisi + "\n");
        //calculer la somme des diviseurs de ce nombre
        int nombresDiviseurs = 0;
        for (int i = 2; i < nombreChoisi / 2; i++) {
            if(nombreChoisi % i == 0) {
                nombresDiviseurs++;
                System.out.print("C'est un nombre parfait");
            }
        }
        //rajouter message en dehors boucle for avec un if
    }
}
