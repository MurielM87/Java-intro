package TP;

import java.time.Year;
import java.util.Scanner;

public class TP_CalculAnneeNaissance {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        //ecrire un programme Age.java
        //demander l'age à l'utilisateur - lit la réponse et l'enregistre dans une variage ENTIER
        System.out.print("Votre âge : ");
        int age= keyboard.nextInt();
        //effectue le calcul de l'annee de naissance et l'enregistre dans une variable ENTIER
        int AnneeActuelle = Year.now().getValue(); //int AnneeActuelle = 2024;
        //afficher annee de naissance
        int annee = AnneeActuelle - age;

        System.out.printf("l'annee de naissance : " + annee);


    }
}
