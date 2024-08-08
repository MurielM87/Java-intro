package TP.CorrectionsChristian.TP.construction;

public class Batiment {
    private String adresse;
    private static int nombreTotalDeBatiments = 0;

    public Batiment() {
        nombreTotalDeBatiments++;
    }

    public Batiment(String adresse) {
        this.adresse = adresse;
        nombreTotalDeBatiments++;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Batiment à l'adresse : " + adresse;
    }

    public String afficherInformation() {
        return "Information du bâtiment : " + toString();
    }

    public static int getNombreTotalDeBatiments() {
        return nombreTotalDeBatiments;
    }
}