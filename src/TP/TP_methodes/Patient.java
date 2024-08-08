package TP.TP_methodes;

import java.util.Scanner;

public class Patient {
    double poids;
    double taille;

    public Patient(double poids, double taille) {
        this.poids = poids;
        this.taille = taille;
    }

    //calculer l'IMC
    public void calculerImc(double poids, double taille) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Indiquez votre poids en kg : ");
        poids = keyboard.nextDouble();
        System.out.print("poids : " + poids + "\n");
        System.out.print("Indiquez votre taille en mètre : ");
        taille = keyboard.nextDouble();
        System.out.print("taille : " + taille + "\n");

        System.out.printf("le patient pèse %.1f pour %.1f\n", poids, taille);
        //IMC = poids en kg / taille² en m.
        if(poids > 0) {
            double imc = poids / (taille * taille); //Math.pow
            System.out.println("IMC " + imc);

            if(imc < 18.4) {
                System.out.printf("%.2f kg/m² : le patient est considéré comme maigre", imc);
            } else if (imc < 24.9) {
                System.out.printf("%.2fkg/m² : le patient est considéré comme ayant une corpulence normale", imc);
            } else if(imc < 29.9) {
                System.out.printf("%.2fkg/m² : le patient est considéré comme en surpoids", imc);
            } else if(imc < 34.9) {
                System.out.printf("%.2fkg/m² : le patient est considéré comme en obésité modérée", imc);
            } else {
                System.out.printf("%.2fkg/m² : le patient est considéré comme en obésité morbide", imc);
            }
        }


    }
}
