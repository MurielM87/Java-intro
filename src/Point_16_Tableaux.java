public class Point_16_Tableaux {
    public static void main(String[] args) {
        //double[] notesPhysique; //[] pour indiquer un tableau - double[] notes ou double notes[], même style pour toutes les variables
        double[] notesPhysique={12, 18, 15, 17, 9.5, 2.3}; //1er façon d'initialiser - tableau à taille fixe
    //    double[] notesMaths;
    //    notesMaths=new double[]{12, 18, 15, 17, 9.5, 2.3}; //2e façon d'initialiser - tableau à taille fixe
    //    double[] notesHistoire=new double[6]; //3e façon d'initialiser avec le nombre d'elements stockes - tableau à taille fixe
                                              //toutes les cellules initialiser par zéro {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}

        System.out.println("taille : " + notesPhysique.length);
        double somme=0; //valeur initiale - pas encore de calculs
        for(int i = 0; i < notesPhysique.length; i++) { //i ou index //ArrayIndexOfBound //taille : 6 mais index : 5 donc strictement inférieur sinon i<=notesPhysique.length-1
            //System.out.println(notesPhysique[i]);
            System.out.printf("notesPhysique[%d] : %.1f\n", i, notesPhysique[i]);
            somme += notesPhysique[i];  //OU somme = somme + notesPhysique[i];

        }

        double moyenne = somme /notesPhysique.length;

        System.out.println("somme : " + somme);
        System.out.println("moyenne : " + moyenne);


/*      AVANT TABLEAU
        double note1=12;
        double note2=18;
        double note3=15;
        double note4=17;
        double note5=9.5;
        double note6=2.3;

       //calculer la somme & la moyenne
        double somme= note1 + note2 + note3;
        double moyenne = somme / 3;
        System.out.println("somme : " + somme + " et moyenne : " + moyenne);
*/


    }
}
