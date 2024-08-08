package TP.HeritageVehicule;

public abstract class Vehicule {
    //Chaque véhicule est caractérisé par son matricule, l’année de son modèle, son prix.
    private static int matricule = 0;
    private int anneeVehicule;
    private double prixVehicule;

    //Lors de la création d’un véhicule, son matricule est incrémenté selon le nombre de véhicules créés.
    public Vehicule(int anneeVehicule, double prixVehicule) {
        this.anneeVehicule = anneeVehicule;
        this.prixVehicule = prixVehicule;
        matricule++;
    }

    //Tous les attributs de la classe véhicule sont supposés privés. Ce qui oblige la création des accesseurs (get…)
    //et des mutateurs (set….) ou les propriétés.

    public static int getMatricule() {
        return matricule;
    }

    public int getAnneeVehicule() {
        return anneeVehicule;
    }

    public double getPrixVehicule() {
        return prixVehicule;
    }

    public static void setMatricule(int matricule) {
        Vehicule.matricule = matricule;
    }

    public void setAnneeVehicule(int anneeVehicule) {
        this.anneeVehicule = anneeVehicule;
    }

    public void setPrixVehicule(double prixVehicule) {
        this.prixVehicule = prixVehicule;
    }

    //La classe Véhicule possède également deux méthodes abstraites démarrer () et accélérer () qui seront définies
    //dans les classes dérivées et qui affichent des messages personnalisés.
    public abstract void demarrer();
    public abstract void accelerer();

    //La méthode toString() de la classe Véhicule retourne une chaîne de caractères qui contient les valeurs du matricule,
    //de l’année du modèle et du prix.
    @Override
    public String toString(){
        return "Le Matricule du véhicule est " + matricule + " et l'année du modèle est " + anneeVehicule + " au prix de " + prixVehicule;
    }
}
