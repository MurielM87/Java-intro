package TP.CorrectionsChristian;

import java.util.Scanner;

public class TP1_8_PariteEtSigneV2 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre : ");
        int nombre=keyboard.nextInt();

//        1. Determiner le signe
        if(nombre>0){
            System.out.println("Le nombre est positif");
        } else if (nombre<0) {
            System.out.println("Le nombre est negatif");
        }else {
            System.out.println("Le nombre est 0");
        }

//        2. Parité > < >= <= ==
        if(nombre%2==0){
            System.out.println("Pair");
        }else{
            System.out.println("Impair");
        }
    }
}
