package TP.CorrectionsChristian;

import java.util.Scanner;
import java.util.ArrayList;

public class TP3_1_NotesCoursTableauxDynamiques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombreNotes;

        // 1. Demander à l'utilisateur combien de notes il souhaite saisir (en s'assurant que ce nombre n'est ni négatif ni nul)
        do {
            System.out.print("Combien de notes souhaitez-vous saisir ? ");
            while (!scanner.hasNextInt()) {
                System.out.print("Veuillez entrer un nombre entier positif : ");
                scanner.next();
            }
            nombreNotes = scanner.nextInt();
            if (nombreNotes <= 0) {
                System.out.println("Le nombre de notes doit être supérieur à zéro.");
            }
        } while (nombreNotes <= 0);

        ArrayList<Double> notesPhysique = new ArrayList<>();

        // 2. Saisir les notes au clavier (chaque note doit être comprise entre 0 et 20 inclus)
        for (int i = 0; i < nombreNotes; i++) {
            double note;
            do {
                System.out.printf("Entrez la note %d (entre 0 et 20) : ", i + 1);
                while (!scanner.hasNextDouble()) {
                    System.out.print("Veuillez entrer un nombre valide : ");
                    scanner.next();
                }
                note = scanner.nextDouble();
                if (note < 0 || note > 20) {
                    System.out.println("La note doit être comprise entre 0 et 20.");
                }
            } while (note < 0 || note > 20);
            notesPhysique.add(note);
        }

        System.out.println("Taille : " + notesPhysique.size());

        double somme = 0;
        for (int i = 0; i < notesPhysique.size(); i++) {
            System.out.printf("notesPhysique[%d] : %.1f\n", i, notesPhysique.get(i));
            somme += notesPhysique.get(i);
        }

        double moyenne = somme / notesPhysique.size();

        System.out.println("Somme : " + somme);
        System.out.println("Moyenne : " + moyenne);
    }
}
