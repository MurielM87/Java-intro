package TP.CorrectionsChristian;

public class TP1_1_Affichage {
    public static void main(String[] args) {
        String nom="Lisangola";
        String prenom="Christian";
        String profession="Développeur";
        int age=16;
        double poids=98.65;

//        Je m'appelle Christian Lisangola, j'ai 16 ans et  je suis développeur. Je pèse 98.6 Kg
        System.out.printf("Je m'appelle %s %s, j'ai %d ans et  je suis %s. Je pèse %.1f Kg",prenom,nom,age,profession,poids);
    }
}
