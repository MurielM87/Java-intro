package TP.HeritageVehicule;

public class Camion extends Vehicule {
    Camion(int anneeVehicule, double prixVehicule) {
        super(anneeVehicule, prixVehicule);
    }

    //Les classes Voiture et Camion étendent la classe Véhicule en définissant concrètement les méthodes accélérer () et démarrer()
    //en affichant des messages personnalisés.
    @Override
    public void demarrer() {
        System.out.println("le camion démarre");
    }
    @Override
    public void accelerer() {
        System.out.println("le camion accélère...");
    }
}
