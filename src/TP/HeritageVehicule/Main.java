package TP.HeritageVehicule;

import java.util.ArrayList;

/*
**TP 1 : Véhicules(Héritage)**
Objectif:
Créer une classe abstraite.
Dériver une classe abstraite.
Implémenter une méthode abstraite.
 */
  /*
    Travail à faire :
Créer la classe abstraite Véhicule.
Créer les classes Camion et Voiture.
Créer une classe Test  qui permet de tester la classe Voiture et la classe Camion
     */
public class Main {
    public static void main(String[] args) {
        Voiture voiture1 = new Voiture(2007, 15000);
        Voiture voiture2 = new Voiture(1995, 2300);
        Camion camion1 = new Camion(1990, 35000);
        Camion camion2 = new Camion(2020, 54000);

        ArrayList<Vehicule> vehicules = new ArrayList<>();
        vehicules.add(voiture1);
        vehicules.add(voiture2);
        vehicules.add(camion1);
        vehicules.add(camion2);

        for(Vehicule vehicule:vehicules) {
            System.out.println(vehicule.toString());
            vehicule.demarrer();
            vehicule.accelerer();
        }
    }


    /*
    Énoncé :
Un parc auto se compose de voitures et des camions qui ont des caractéristiques communes regroupées dans la classe Véhicule.
Chaque véhicule est caractérisé par son matricule, l’année de son modèle, son prix.
Lors de la création d’un véhicule, son matricule est incrémenté selon le nombre de véhicules créés.
Tous les attributs de la classe véhicule sont supposés privés. Ce qui oblige la création des accesseurs (get…)
et des mutateurs (set….) ou les propriétés.
La classe Véhicule possède également deux méthodes abstraites démarrer () et accélérer () qui seront définies
dans les classes dérivées et qui affichent des messages personnalisés.
La méthode toString() de la classe Véhicule retourne une chaîne de caractères qui contient les valeurs du matricule,
de l’année du modèle et du prix.
Les classes Voiture et Camion étendent la classe Véhicule en définissant concrètement les méthodes accélérer () et démarrer()
en affichant des messages personnalisés.
     */
}
