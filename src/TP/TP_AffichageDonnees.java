package TP;

import java.util.Scanner;

public class TP_AffichageDonnees {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Votre nom : ");
        String nom=keyboard.nextLine();

        System.out.print("Votre prénom : ");
        String prenom = keyboard.nextLine();

        System.out.print("Votre âge : ");
        int age= keyboard.nextInt();

        System.out.printf("Vous vous appelez %s %s, et vous avez %d ans", prenom, nom, age);
    }
}