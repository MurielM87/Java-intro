package TP;

import java.util.Scanner;
//Écrire un programme qui permet à l’utilisateur de saisir un entier entre 1 et 12 et qui affiche le nom du mois correspondant.
public class TP_AffichageCalendrierNombreMois {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Entrez un nombre entre 1 et 12 : ");
        int mois=keyboard.nextInt();
        switch(mois) { //ancienne version - maintenant "->" sans break (voir point12)
            case 1:
                System.out.print("Janvier");
                break;
            case 2:
                System.out.print("Février");
                break;
            case 3:
                System.out.print("Mars");
                break;
            case 4:
                System.out.print("Avril");
                break;
            case 5:
                System.out.print("Mai");
                break;
            case 6:
                System.out.print("Juin");
                break;
            case 7:
                System.out.print("Juillet");
                break;
            case 8:
                System.out.print("Août");
                break;
            case 9:
                System.out.print("Septembre");
                break;
            case 10:
                System.out.print("Octobre");
                break;
            case 11:
                System.out.print("Novembre");
                break;
            case 12:
                System.out.print("Décembre");
                break;
            default:
                System.out.print("ce nombre ne correspond à aucun mois");
        };
    keyboard.close();
    }
}
