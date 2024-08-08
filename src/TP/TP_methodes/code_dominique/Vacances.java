package TP.TP_methodes.code_dominique;

import java.util.Scanner;

public class Vacances {
    static Tirelire tirelire = new Tirelire(0);
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bienvenue dans votre e-Tirelire 4.0 !");

        while (true) {
            System.out.println();
            System.out.println("1 : afficher le montant");
            System.out.println("2 : secouer la tirelire");
            System.out.println("3 : mettre de l'argent");
            System.out.println("4 : vider la tirelire");
            System.out.println("5 : retirer de l'argent");
            System.out.println("6 : évaluer un budget");
            System.out.println("7 : quitter");
            switch (kb.nextInt()) {
                case 1 -> tirelire.afficher();
                case 2 -> tirelire.secouer();
                case 3 -> ajouter();
                case 4 -> vider();
                case 5 -> tirelire.puiser(0);
                case 6 -> tirelire.calculerSolde(0);
                case 7 -> tirelire.quitter(true);
            }
        }
    }

    public static void ajouter() {
        double montant;

        System.out.print("Entrez le montant que vous souhaitez ajouter : ");
        montant = kb.nextDouble();
        if (tirelire.remplir(montant)) {
            System.out.println(montant + " euros ont bien été ajoutés à votre tirelire !");
        } else {
            System.out.println("Aucun argent n'a été ajouté à votre tirelire.");
        }
    }

    public static void vider(){
        double montant = tirelire.getMontant();

        tirelire.vider();
        System.out.println("Vous avez vidé votre tirelire et retiré " + montant + " euros.");
    }

}
