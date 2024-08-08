package jeux;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Personnage p = new Personnage("Zozor", 100); //car ajout abstract dans Personnage donc inutil
        Guerrier alexandreTheGreat = new Guerrier("Alexandre", 200, "lance"); //Personnage alex = new Guerrier
        Magicien yannis = new Magicien("Yannis", 500, "baguette magique"); //Personnage yannis = new Magicien
        BossFinal dominique = new BossFinal("Dominique", 12000, 7000); //Personnage dominique = new BossFinal

        ArrayList<Personnage> personnages = new ArrayList <> (); //List<Personnage> personnages = new ArrayList <> ()
        //ArrayList est générique : il peut stocker plusieurs types de données

        personnages.add(alexandreTheGreat);
        personnages.add(yannis);
        personnages.add(dominique);

        for(Personnage personnage : personnages) { //for each - chaque itération
            personnage.attaquer();
        }

/*        ArrayList <String> xoxo = new ArrayList<>();
        xoxo.add("papy");
        xoxo.add("mamy");
        xoxo.add(String.valueOf(yannis)); //mais pas xoxo.add(yannis)
        //ArrayList est générique car peut stocker plusieurs types de données
        */

    }
}
