package TP;

import java.util.Scanner;

public class TP_NombrePairImpairPositifNegatif {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        //Entrez un nombre entier: 5
        System.out.println("Entrez un nombre entier : ");
        int Number= keyboard.nextInt();
        //nombre positif
        boolean estPositif=Number>0;
        //nombre négatif
        boolean estNegatif=Number<0;
        //nombre égal à 0
        boolean estEgal=Number==0;
        //nombre pair
        boolean estPair=Number%2==0;
        //nombre impair
        boolean estImpair=Number%2!=0;

        if(estPositif && estPair) {
            System.out.println("le nombre est positif et pair");
        } else if(estPositif && estImpair) {
            System.out.println("le nombre est positif et impair");
        } else if(estNegatif && estPair) {
            System.out.println("le nombre est négatif et pair");
        } else if(estNegatif && estImpair) {
            System.out.println("le nombre est négatif et impair");
        } else if(estEgal) {
            System.out.println("le nombre est égal à 0");
        }


    }
}
