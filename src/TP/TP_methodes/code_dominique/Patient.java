package TP.TP_methodes.code_dominique;

public class Patient {
    private String nom;
    private String prenom;
    private double poids;
    private double taille;

    public Patient(String nom, String prenom, double poids, double taille) {
        this.nom = nom;
        this.prenom = prenom;
        this.poids = poids;
        this.taille = taille;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public double imc(){
        return this.poids / (this.taille * this.taille);
    }
}
