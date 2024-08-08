package TP.Bibliotheque;


public class Bibliotheque {
    private String bibliothequeNom;
    private int exemplaires;

    public Bibliotheque(String bibliothequeNom, int exemplaires) {
        this.bibliothequeNom = bibliothequeNom;
        this.exemplaires = exemplaires;
    }

    public String getBibliothequeNom() {
        return bibliothequeNom;
    }

    public void setBibliothequeNom(String bibliothequeNom) {
        this.bibliothequeNom = bibliothequeNom;
    }

    public int getExemplaires() {
        return exemplaires;
    }

    public void setExemplaires(int exemplaires) {
        this.exemplaires = exemplaires;
    }
}
