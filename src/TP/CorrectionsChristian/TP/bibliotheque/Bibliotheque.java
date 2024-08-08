package TP.CorrectionsChristian.TP.bibliotheque;

import java.util.ArrayList;

public class Bibliotheque {
    private String nom;
    private ArrayList<Exemplaire> exemplaires;

    public Bibliotheque(String nom) {
        this.nom = nom;
        this.exemplaires = new ArrayList<>();
        System.out.println("La bibliothèque " + nom + " est ouverte !");
    }

    public String getNom() {
        return nom;
    }

    public int getNbExemplaires() {
        return exemplaires.size();
    }

    public void stocker(Oeuvre oeuvre, int n) {
        for (int i = 0; i < n; i++) {
            exemplaires.add(new Exemplaire(oeuvre));
        }
    }

    public void stocker(Oeuvre oeuvre) {
        stocker(oeuvre, 1);
    }

    public ArrayList<Exemplaire> listerExemplaires(String langue) {
        ArrayList<Exemplaire> result = new ArrayList<>();
        for (Exemplaire ex : exemplaires) {
            if (langue.isEmpty() || ex.getOeuvre().getLangue().equals(langue)) {
                result.add(ex);
            }
        }
        return result;
    }

    public ArrayList<Exemplaire> listerExemplaires() {
        return listerExemplaires("");
    }

    public int compterExemplaires(Oeuvre oeuvre) {
        int count = 0;
        for (Exemplaire ex : exemplaires) {
            if (ex.getOeuvre().equals(oeuvre)) {
                count++;
            }
        }
        return count;
    }

    public void afficherAuteur(boolean prime) {
        for (Exemplaire ex : exemplaires) {
            Auteur auteur = ex.getOeuvre().getAuteur();
            if (auteur.getPrix() == prime) {
                System.out.println(auteur.getNom());
            }
        }
    }

    public void afficherAuteur() {
        afficherAuteur(true);
    }
}