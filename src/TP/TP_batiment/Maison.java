package TP.TP_batiment;

public class Maison extends Batiment {
    private int nbPieces;

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
        return "Maison{" +
                " L'adresse est'" + getAdresse() + '\'' +
                ", le nombre de pieces= " + nbPieces + '\'' +
                ", et le nombre total de bâtiments = " + getNombreTotalDeBatiments() +
                '}';
    }

    @Override
    public String afficherInformation() {
        String information;
        information = super.afficherInformation() + "\n " + nbPieces;
        return information;
    }

    @Override
    public void occuper(int nbDePersonnes) {
        super.occuper(nbDePersonnes);
    }
}
