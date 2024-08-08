public class Point_20_MethodesNotesDuplication {


    public static void main(String[] args) {
        double[] notesPhysique={12, 18, 15, 17, 9.5, 2.3};

        double sommePhysique
                =0;
        for(int i = 0; i < notesPhysique.length; i++) {
            sommePhysique += notesPhysique[i];
        }

        double moyennePhysique = sommePhysique /notesPhysique.length;

        System.out.println("somme physique : " + sommePhysique);
        System.out.println("moyenne physique : " + moyennePhysique);


    //histoire
    double[] notesHistoire={12, 18, 15, 17, 9.5, 2.3};

    double sommeHistoire=0;
        for(int i = 0; i < notesHistoire.length; i++) {
        sommeHistoire += notesHistoire[i];
    }

    double moyenneHistoire = sommeHistoire /notesHistoire.length;

        System.out.println("somme Histoire : " + sommeHistoire);
        System.out.println("moyenne Histoire : " + moyenneHistoire);

        //maths
        double[] notesMaths={12, 18, 15, 17, 9.5, 2.3};

        double sommeMaths=0;
        for(int i = 0; i < notesMaths.length; i++) {
            sommeMaths += notesMaths[i];
        }

        double moyenneMaths = sommeMaths /notesMaths.length;

        System.out.println("somme M : " + sommeMaths);
        System.out.println("moyenne M : " + moyenneMaths);

    }
}


