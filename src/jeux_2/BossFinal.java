package jeux_2;

//final signifie que cette classe ne peut pas être étendue
public final class BossFinal extends Personnage implements Combattant { //'final' pour la toute derniere version - pas possible extends //class String est une class final
    private int niveauPuissance; //personnage spécial/enrichi

    public BossFinal(String nom, int dureeDeVie, int niveauPuissance) {
        super(nom, dureeDeVie);
        this.niveauPuissance = niveauPuissance;
    }

    @Override
    public void attaquer() {
        System.out.println("Je vais t'écraser...");
    }

    @Override
    public void defendre() {
        System.out.println("Je suis moi-même un bouclier...");
    }

    @Override
    public String toString() {
        return String.format("%s \nNiveau de Puissance : %s", super.toString(), this.niveauPuissance);
    }
}
