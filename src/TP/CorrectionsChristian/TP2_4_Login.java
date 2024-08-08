package TP.CorrectionsChristian;

import java.util.Scanner;

public class TP2_4_Login {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String email, password;
        String inputEmail, inputPassword;
        int attempts = 0;
        final int MAX_ATTEMPTS = 5;

        // Définition des identifiants
        System.out.print("Définissez votre adresse email : ");
        email = keyboard.nextLine();
        System.out.print("Définissez votre mot de passe : ");
        password = keyboard.nextLine();

        System.out.println("Credentials définis. Passons à la vérification.\n");

        // Boucle de vérification
        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Entrez votre email : ");
            inputEmail = keyboard.nextLine();
            System.out.print("Entrez votre mot de passe : ");
            inputPassword = keyboard.nextLine();
            attempts++;
            if (inputEmail.equals(email) && inputPassword.equals(password)) {
                System.out.println("Bienvenu dans votre espace client");
                break;
            } else {
                if (attempts >= MAX_ATTEMPTS) {
                    System.out.println("Vous avez saisi des mauvais identifiants " + attempts + " fois, votre compte est bloqué.");
                } else {
                    System.out.println("Identifiants incorrects");
                }
            }
        }

        keyboard.close();
    }
}
