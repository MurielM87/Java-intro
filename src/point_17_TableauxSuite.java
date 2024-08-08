public class point_17_TableauxSuite {
    public static void main(String[] args) {

        double[] notesPhysique={12, 18, 15, 17, 9.5, 2.3};
        System.out.println("taille : " + notesPhysique.length);
        double somme=0; //valeur initiale - pas encore de calculs
        for(int i = 0; i < notesPhysique.length; i++) { //i ou index //ArrayIndexOfBound //taille : 6 mais index : 5 donc strictement inférieur sinon i<=notesPhysique.length-1
            //System.out.println(notesPhysique[i]);
            System.out.printf("notesPhysique[%d] : %.1f\n", i, notesPhysique[i]);
            somme += notesPhysique[i];  //OU somme = somme + notesPhysique[i];

        }

        notesPhysique[0] = 15; //car tableau statique
        notesPhysique[4] = 16; //la taille du tableau ne peux pas évoler et est déjà connue
        double moyenne = somme /notesPhysique.length;

        System.out.println("somme : " + somme);
        System.out.println("moyenne : " + moyenne);

    }
}