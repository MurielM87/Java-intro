package TP;

import java.util.Scanner;

public class TP_verifEmailPassword {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //TP1 : l'utilisateur définit une adresse mail et un mot de passe
        System.out.print("Veuillez saisir votre email : ");
        String emailChoisi = keyboard.next();
        System.out.print("Veuillez saisir un mot de passe : ");
        String passwordChoisi = keyboard.next();

        //l'utilisateur fournit l'email et le mot de passe
        String emailATrouver;
        String passwordATrouver;
        //initialisation variables pour essai
        int essai = 0;
        int essaiMax = 5;
        do {
            System.out.print("Veuillez saisir votre email : ");
            emailATrouver = keyboard.next();
            System.out.print("Veuillez saisir votre mot de passe : ");
            passwordATrouver = keyboard.next();
            //si pas correspondance aux valeurs définies, message "Identifiants incorrects" et recommencer saisie
            //correspondance, message "Bienvenue dans votre espace client"
            if (!emailATrouver.equals(emailChoisi) || !passwordATrouver.equals(passwordChoisi)) {
                System.out.print("Identifiants incorrects \n");
                essai++;
                //5 tentatives sinon “Vous avez saisi des mauvais identifiants x fois, votre compte est bloqué”.
                if (essai == essaiMax) {
                    System.out.printf("Vous avez saisi des mauvais identifiants " + essai + " fois, votre compte est bloqué");
                    break;
                }
            } else
            //if (emailATrouver.equals(emailChoisi) && passwordATrouver.equals(passwordChoisi))
            {
                System.out.print("Bienvenue dans votre espace client");
            }

        } while (!emailATrouver.equals(emailChoisi) || !passwordATrouver.equals(passwordChoisi));
    }

}
