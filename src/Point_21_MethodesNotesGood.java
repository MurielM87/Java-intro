public class Point_21_MethodesNotesGood {

    //creation fonction calculSomme
    public static double calculSomme(double[] notes){
        double resultat=0;
        for(double note:notes){ //(comme forEach) à chaque itération, note prendre valeur selon index dans notes - note dans notes jusqu'à la dernière note
            resultat +=note;
        }
        return resultat;
    }

    public static void main(String[] args) {
        //Physique
        double[] notesPhysique={12,18,15,17,9.5,2.3};
        double sommePhysique=calculSomme(notesPhysique);

        double moyennePhysique=sommePhysique/notesPhysique.length;

        System.out.println("Somme physique : "+sommePhysique);
        System.out.println("Moyenne physique : "+moyennePhysique);

        //Histoire
        double[] notesHistoire={12,18,15,17,9.5,2.3};
        double sommeHistoire=calculSomme(notesHistoire);
        double moyenneHistoire=sommeHistoire/notesHistoire.length;

        System.out.println("Somme Histoire: "+sommeHistoire);
        System.out.println("Moyenne Histoire : "+moyenneHistoire);



        //Histoire
        double[] notesMath={12,18,15,17,9.5,2.3};
        double sommeMath=calculSomme(notesMath);
        double moyenneMath=sommeMath/notesMath.length;

        System.out.println("Somme Math: "+sommeMath);
        System.out.println("Moyenne Math : "+moyenneMath);
    }
}
