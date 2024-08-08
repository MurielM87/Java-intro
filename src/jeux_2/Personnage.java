package jeux_2;
//'abstract' pour empecher de recréer des personnages en dehors
public abstract class Personnage {
    private String nom;
    private int dureeDeVie;
    private static int nombrePersonnages = 0;

    public Personnage(String nom, int dureeDeVie) {
        this.nom = nom;
        this.dureeDeVie = dureeDeVie;
        nombrePersonnages++;
    }

    //quand variable static, méthode pour y accéder
    public static int getNombrePersonnages() {
        return nombrePersonnages;
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

    @Override
    public String toString() { //return String.format("Nom : %s; durée de vie : %D", nom, dureeDeVie);
        return "Personnage{" +
                "dureeDeVie=" + dureeDeVie +
                ", nom='" + nom + '\'' +
                '}';
    }

/*        //methode abstraite : n'a pas de corps (pas de comportement) -
    //tous les personnages doivent pouvoir attaquer et se défendre mais à leur propre façon
    public abstract void attaquer();
    public abstract void defendre();*/ //parti dans interface
}
