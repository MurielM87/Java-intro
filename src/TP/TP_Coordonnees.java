package TP;

public class TP_Coordonnees {
//On vous donne comme argument un tableau contenant des chaînes de directions (haut, bas, gauche, droite).
// Imaginez une personne debout sur une grille au point 0, 0.
// Pour chaque direction dans le tableau de chaînes, déplacez votre personne dans cette direction sur la grille.
// Retournez le point final X,Y où se trouve la personne sous la forme d'un tableau de deux entiers.
//Exigences : Doit retourner un tableau de deux entiers

    public static int[] maMethode(String[] directions) {
        int[] position = {0,0};
        for (String direction:directions) {
            switch (direction.toLowerCase()){
                case "bas" -> position[1]--;
                case "gauche" -> position[0]--;
                case "droite" -> position[0]++;
                case "haut" -> position[1]++;
            }
        }
        return position;
    }

    //Exemple d'exécution : //`maMethode(["haut", "haut", "bas", "gauche", "gauche", "droite", "haut"])`
    //Resultat : > [-1, 2]
    public static void main(String[] args) {
        String[] directions = {"haut", "haut", "bas", "gauche", "gauche", "droite", "haut"};
        System.out.println("résultat : " + maMethode(directions));
    }
}
