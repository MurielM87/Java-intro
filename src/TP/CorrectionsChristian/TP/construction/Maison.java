package TP.CorrectionsChristian.TP.construction;

public class Maison extends Batiment implements Habitable {
    private int nbPieces;

    public Maison() {
        super();
    }

    public Maison(String adresse, int nbPieces) {
        super(adresse);
        this.nbPieces = nbPieces;
    }

    public int getNbPieces() {
        return nbPieces;
    }

    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;
    }

    @Override
    public String toString() {
        return super.toString() + ", nombre de pièces : " + nbPieces;
    }

    @Override
    public String afficherInformation() {
        return "Information de la maison : " + toString();
    }

    @Override
    public void occuper(int nombreDePersonnes) {
        System.out.println("La maison est occupée par " + nombreDePersonnes + " personnes.");
    }
}