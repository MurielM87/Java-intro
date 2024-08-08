package jeux;

public class Magicien extends Personnage{
    private String baguetteMagique;

    public Magicien(String nom, int dureeDeVie, String baguetteMagique) {
        super(nom, dureeDeVie);
        this.baguetteMagique = baguetteMagique;
    }

    public String getBaguetteMagique() {
        return baguetteMagique;
    }

    public void setBaguetteMagique(String baguetteMagique) {
        this.baguetteMagique = baguetteMagique;
    }

    //methode pour combattre - public car doit être accessible depuis l'extérieur / appelé depuis l'API public
    public void attaquer() {
        System.out.println("Je lance un sort");
    }
    public void defendre() {
        System.out.println("Je crée un bouclie magique...");
    }
}
