package TP.TP_methodes.code_dominique;
//logiciel secretariat

import java.util.ArrayList;
import java.util.Scanner;

public class Secretariat {
    static ArrayList<Patient> annuaire = new ArrayList<>();

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Bienvenue au secrétariat de la maison médicale");

        while (true) {
            System.out.println("1 : enregistrer un nouveau patient");
            System.out.println("2 : afficher les informations sur un patient");
            System.out.println("3 : afficher la liste des patients");
            System.out.println("4 : quitter");
            switch (kb.nextInt()) {
                case 1 -> enregistrer();
                case 2 -> afficher();
                case 3 -> afficherListe();
                case 4 -> quitter();
            }
            System.out.println();
        }
    }

    public static void enregistrer(){
        String nom, prenom;
        double poids, taille;
        Scanner kb;

        kb = new Scanner(System.in);
        System.out.println("Veuillez entrer les informations relatives au nouveau patient : ");
        System.out.print("Prénom : ");
        prenom = kb.nextLine();
        System.out.print("Nom : ");
        nom = kb.nextLine();
        System.out.print("Poids (en kg) : ");
        poids = kb.nextDouble();
        System.out.print("Taille (en m) : ");
        taille = kb.nextDouble();

        Patient patient = new Patient(nom, prenom, poids, taille);
        annuaire.add(patient);
        System.out.println("Le nouveau patient a bien été enregistré\n");
    }
    public static void afficher(){
        String nom, prenom;
        Scanner kb;
        Patient patient;
        boolean trouve;

        kb = new Scanner(System.in);
        System.out.println("Saisissez les informations du patient dont vous voulez afficher les informations : ");
        System.out.print("Prénom : ");
        prenom = kb.nextLine();
        System.out.print("Nom : ");
        nom = kb.nextLine();

        trouve = false;
        for (Patient p : annuaire){
            if (p.getNom().equals(nom) && p.getPrenom().equals(prenom)) {
                System.out.println("Voici les informations trouvées sur le patient : " + prenom + " " + nom );
                System.out.println("Taille : " + p.getTaille() + "m");
                System.out.println("Poids : " + p.getPoids() + "kg\n");
                trouve = true;
                break;
            }
        }

        if (!trouve) System.out.println("Le patient n'est pas dans l'annuaire de la clinique.\n");
    }

    public static void afficherListe(){
        for (Patient p : annuaire){
            System.out.println(p.getPrenom() + " " + p.getNom());
        }
    }

    public static void quitter(){
        System.out.println("Merci d'avoir utilisé le logiciel de gestion M2I Santé.\n");
        System.exit(0);
    }
}

