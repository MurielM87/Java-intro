package TP;

import java.util.Scanner;

public class TP_NombrePairImpairPositifNegatifEgal_V2 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre=keyboard.nextInt();

        //Determiner le signe (positif, negatif, zero)
        if(nombre>0) {
            System.out.println("nombre positif");
        } else if(nombre<0){
            System.out.println("nombre négatif");
        } else {
            System.out.println("nombre égal à 0");
        }

        //Pair ou impair
        if(nombre%2==0) {
            System.out.println("nombre pair");
        } else {
            System.out.println("nombre impair");
        }

        //OU operateur ternaire
        //positif, negatif, 0
        String signeNombre = (nombre > 0) ? "positif" : (nombre < 0) ? "négatif" : "zéro"; // ? -> condition :-> sinon
        //pair ou impair
        //String parite = (nombre % 2 == 0) ? "pair" : "impair";
        String parite = "";
        if(nombre%2 == 0) {
            parite = "pair";
        } else {
            parite = "impair";
        }
        if(nombre == 0) {
            System.out.println("zéro et pair");
        } else {
            System.out.println("le nombre est " + signeNombre + " et " + parite);
        }

        //methode Switch
    /*    String signe = switch(Integer.signum(nombre)) {
            case 1 -> "positif";
            case -1 -> "négatif";
            case 0 -> "zéro";
        }
        String parite = (nombre % 2 == 0) ? "pair" : "impair";

        */
    }
}
