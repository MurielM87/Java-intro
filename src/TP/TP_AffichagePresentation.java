package TP;

public class TP_AffichagePresentation {
    public static void main(String[] args) {
        String nom="Marchal";
        String prenom="Muriel";
        String profession="développeuse";
        int age=37;
        double poids=70.35;

        //%s string - %f float - %e float or double - %b boolean - %d entier
        //afficher je m'appelle PRENOM NOM, j'ai AGE ans et je suis PROFESSION, je pèse POIDS Kg
        //pour %f écrire "%.1f" pour un chiffre (mettre le chiffre souhaite) apres la virgule (peut aussi arrondir)
        System.out.printf("je m'appelle %s %s, j'ai %d ans et je suis %s, je pèse %.1f Kg", prenom, nom, age, profession, poids);

    }
}
