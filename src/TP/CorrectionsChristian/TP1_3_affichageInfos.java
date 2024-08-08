package TP.CorrectionsChristian;

import java.util.Scanner;

public class TP1_3_affichageInfos {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entrez votre nom : ");
        String nom = keyboard.nextLine();
        System.out.print("Entrez votre prénom : ");
        String prenom = keyboard.nextLine();
        System.out.print("Entrez votre âge : ");
        int age = keyboard.nextInt();
        System.out.printf("Vous vous appelez %s %s, et vous avez %d ans\n", prenom, nom, age);
        keyboard.close();
    }
}
