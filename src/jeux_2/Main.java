package jeux_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Personnage p = new Personnage("Zozor", 100); //car ajout abstract dans Personnage donc inutil
        Guerrier alexandreTheGreat = new Guerrier("Alexandre", 200, "lance"); //Personnage alex = new Guerrier
        Magicien yannis = new Magicien("Yannis", 500, "baguette magique"); //Personnage yannis = new Magicien
        BossFinal dominique = new BossFinal("Dominique", 12000, 7000); //Personnage dominique = new BossFinal
        PNJ chris = new PNJ("Chris", 10,"bonjour");

        //appel version avec 2 paramètres -> polymorphisme - surcharge : plusieurs versions de la meme methode/constructeur
        Guerrier michael = new Guerrier("Michael", "M16");
        //appel version avec 1 paramètre
        Guerrier thierry = new Guerrier("Thierry");

        //pour compter tous les personnages (avec la class spécifique Personnage - variable STATIC
        System.out.println("nombre : " + Personnage.getNombrePersonnages());

        //avec l'interface
        List<Combattant> combattants = new ArrayList<>();
        combattants.add(alexandreTheGreat);
        combattants.add(yannis);
        combattants.add(dominique);

        for(Combattant combattant:combattants) {
            combattant.attaquer();
            combattant.defendre();
        }

/*        List<Personnage> personnages = new ArrayList<>();
        personnages.add(alexandreTheGreat);
        personnages.add(yannis);
        personnages.add(dominique);
    //    personnages.add(chris);*/

        List<Personnage> personnages = new ArrayList<>(List.of(alexandreTheGreat, yannis, dominique, chris));
        for(Personnage personnage:personnages) {
            //System.out.println(personnage.getNom()); //getNom methode publique dans Personnage.java
            System.out.println(personnage + "\n"); //méthode toString appelé implicitement
        }
        //jeux_2.Guerrier@5b6f7412 : public String toString() {
        //        return getClass().getName() + "@" + Integer.toHexString(hashCode());
        //    }

    /*    ArrayList<Integer> x = new ArrayList<>();
        x.add(45);
        x.add(67);
        System.out.println(x);*/



        /*
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

/*ajout armes
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Epee epee=new Epee();
        Lance lance=new Lance();

        Guerrier alexandreTheGreat=new Guerrier("Alexandre",200,lance);
        Magicien yannis=new Magicien("Yannis",500,"ma baguette magique");
        BossFinal dominique=new BossFinal("Dominique",12000,7000);
        PNJ chris=new PNJ("Chris",10,"Bonjour!");


        Guerrier michael=new Guerrier("Michael",epee);

        System.out.println("Nombre : "+Personnage.getNombrePersonnage());



        List<Combattant> combattants=new ArrayList<>();

        combattants.add(alexandreTheGreat);
        combattants.add(yannis);
        combattants.add(dominique);

        for(Combattant combattant:combattants){
            combattant.attaquer();
        }

        List<Personnage> personnages=new ArrayList<>(List.of(alexandreTheGreat,yannis,dominique,chris));

        for(Personnage personnage:personnages){
            System.out.println(personnage+"\n");

        }
    }
}
 */