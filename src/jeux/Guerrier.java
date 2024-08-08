package jeux;

public class Guerrier extends Personnage{
    private String arme;

    public Guerrier(String nom, int dureeDeVie, String arme) {
        //appeler constructor du parent (cf Personnage) avec super()
        super(nom, dureeDeVie);
        this.arme = arme;
    }


    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }

    //methode pour combattre - public car doit être accessible depuis l'extérieur / appelé depuis l'API public
    public void attaquer() {
        System.out.println("Je vais te tuer");
    }
    public void defendre() {
        System.out.println("J'utilise mon bouclier...");
    }
}
