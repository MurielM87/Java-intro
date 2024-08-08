package TP.TP_batiment;

public class Batiment implements Habitable {
    private String adresse;
    private static int nombreBatiments = 0;
    private String nbPieces;

    public Batiment(String adresse) {
        this.adresse = adresse;
        nombreBatiments++;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String afficherInformation() {
        return adresse;
    }

    @Override
    public String toString() {
        return "Batiment{" +
                "L'adresse est " + adresse + '\'' +
                ", il y " + nbPieces + " de pieces" + '\'' +
                "le nombre total de bâtiments est " + nombreBatiments +
                '}';
    }

    public static int getNombreTotalDeBatiments() {
        return nombreBatiments;
    }


    @Override
    public void occuper(int nbDePersonnes) {

    }
}
