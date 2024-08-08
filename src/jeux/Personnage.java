package jeux;
//'abstract' pour empecher de recréer des personnages en dehors
public abstract class Personnage {
    private String nom;
    private int dureeDeVie;

    public Personnage(String nom, int dureeDeVie) {
        this.nom = nom;
        this.dureeDeVie = dureeDeVie;
    }

    public String getNom() {
        return nom;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDureeDeVie(int dureeDeVie) {
        this.dureeDeVie = dureeDeVie;
    }

    //methode abstraite : n'a pas de corps (pas de comportement) -
    //tous les personnages doivent pouvoir attaquer et se défendre mais à leur propre façon
    public abstract void attaquer();
    public abstract void defendre();
}
