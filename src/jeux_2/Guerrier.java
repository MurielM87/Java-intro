package jeux_2;

public class Guerrier extends Personnage implements Combattant {
    private String arme;
    private final static int DUREE_DE_VIE_PAR_DEFAULT = 100;

    public Guerrier(String nom, int dureeDeVie, String arme) {
        //appeler constructor du parent (cf Personnage) avec super()
        super(nom, dureeDeVie);
        this.arme = arme;
    }

    //surcharge : au sein d'une class, plusieurs méthodes de même nom mais avec différentes signatures
    public Guerrier(String nom, String arme) {
        this(nom, DUREE_DE_VIE_PAR_DEFAULT,arme);
        /*super(nom, 100);
        this.arme = arme;*/
    }
    public Guerrier(String nom){
        this(nom, DUREE_DE_VIE_PAR_DEFAULT, "AK-47");
        /*super(nom, 100);
        this.arme = "AK 47";*/
    }

    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }

    @Override
    public void attaquer() {
        System.out.println("Je vais te tuer");
    }

    @Override
    public void defendre() {
        System.out.println("J'utilise mon bouclier...");
    }

    @Override
    public String toString() {
        return String.format("%s \nArme : %s", super.toString(), this.arme);
    }

    //methode pour combattre - public car doit être accessible depuis l'extérieur / appelé depuis l'API public
/*    public void attaquer() {
        System.out.println("Je vais te tuer");
    }
    public void defendre() {
        System.out.println("J'utilise mon bouclier...");
    }*/
}
