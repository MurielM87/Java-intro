package TP.TP_methodes;

public class TP_CompteurNombresPairsTableau {
    //Créez une méthode `nombresPairsTableau(int[] tableau)` qui retourne le nombre d'éléments pairs dans le tableau.
    public static int nombresPairsTableau(int[] nombres) {
        int nombrePair = 0;
        /*for(int i = 0; i < nombres.length; i++) {
            //nombre pair ou impair
            if(tableau[i] % 2 == 0) {
                nombrePair++;
            };
        }*/
    //ou utiliser boucle for each
        for(int nombre : nombres ){
            if(nombre % 2 == 0) {
                nombrePair++;
            }
        }
        return nombrePair;
    }

    public static void main(String[] args) {
        //Tableau : [1, 2, 3, 4, 5, 6, 7, 8]
        int[] tableau = new int[] {1,2,3,4,5,6,7,8};
        System.out.println("il y a " + nombresPairsTableau(tableau) + " éléments pairs dans ce tableau");
    }
}
