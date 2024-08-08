package Personnes_heritage;

public class Personne {
    private String nom;
    private String prenom;
    private int age;

    public void Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
