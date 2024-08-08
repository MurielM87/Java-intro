package TP.CorrectionsChristian;

import java.util.Scanner;

public class TP2_1_Equation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("a : ");
        double a=input.nextDouble();//1

        System.out.print("b : ");
        double b=input.nextDouble();//4;

        System.out.print("c : ");
        double c=input.nextDouble();//1;
        double x1;
        double x2;
        double delta=Math.pow(b,2)-4*a*c;

        if(a==0){
            System.err.println("Le coefficient de x\u00B2 vaut 0. Ce n'est donc pas une" +
                    " équation du 2nd degré");
            System.exit(1);
        }

        System.out.printf("Equation de la forme %.1fx\u00B2 + %.1fx + %.1f = 0 \n\n",a,b
                ,c);

        if(delta>=0){
            x1=(-b-Math.sqrt(delta))/(2*a);
            x2=(-b+Math.sqrt(delta))/(2*a);
            if(delta==0){
                System.out.println("L'équation admet une seule racine où x1 = x2");
            }
            System.out.printf("x1 = %.2f , x2 = %.2f",x1,x2);
        }else{
            System.out.println("L'équation n'admet aucune racine réelle.");
        }
    }
}


/*
* Deux solutions réelles distinctes (Δ > 0) :
a = 1, b = 5, c = 6
Résultat attendu : x1 = -3,00 et x2 = -2,00
*
Une solution réelle double (Δ = 0) :
a = 1, b = -4, c = 4
Résultat attendu : x1 = x2 = 2,00
*
*
Pas de solution réelle (Δ < 0) :
a = 1, b = 2, c = 3
Résultat attendu : Aucune solution réelle
*
*
Coefficients négatifs :
a = -2, b = -7, c = -3
Résultat attendu : x1 = -3,00 et x2 = -0,50
*
*
Grands coefficients :
a = 100, b = 1000, c = 1000
Résultat attendu : x1 = -9,90 et x2 = -0,10
*
*
Petits coefficients :
a = 0.1, b = 0.2, c = 0.1
Résultat attendu : x1 = -1,00 et x2 = -1,00
*
*
Coefficient 'a' proche de zéro (mais pas zéro) :
a = 0.0001, b = 1, c = 1
Résultat attendu : x1 = -9999,00 et x2 = -1,00
*
*
Cas particulier : a = 0 (pas une équation du second degré) :
a = 0, b = 2, c = 1
Résultat attendu : Message d'erreur indiquant que ce n'est pas une équation du second degré
* */