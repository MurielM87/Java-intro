package TP.Bibliotheque.catalogue;

public class Oeuvre extends Auteur /*implements langue*/ {
    private String titre;
    private String langue;

    public Oeuvre(String nom, String titre, String langue) {
        super(nom);
        this.titre = titre;
        this.langue = langue;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }
}
