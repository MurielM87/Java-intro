import java.util.ArrayList;

public class Point_18_TableauxDynamiques {
    public static void main(String[] args) {
//demander à l'utilisateur combien de notes ils souhaites saisir (pas de valeur négatives ou nulles)
        ArrayList <Double> notesPhysique=new ArrayList();
        notesPhysique.add(12.0); //pour ajouter une valeur
        notesPhysique.add(18.0);
        notesPhysique.add(15.0);

        //String n = "56";
        //int m = Integer.parseInt(n); //pour convertir nombre dans String en Entier
        //OU double m = Double.parseDouble(n);

        System.out.println("taille : " + notesPhysique.size()); //on remplace length par size()

        double somme=0;
        for(int i = 0; i < notesPhysique.size(); i++) { //i ou index //ArrayIndexOfBound //taille : 6 mais index : 5 donc strictement inférieur sinon i<=notesPhysique.length-1
            //System.out.println(notesPhysique[i]);
            System.out.printf("notesPhysique[%d] : %.1f\n", i, notesPhysique.get(i)); //on remplace [i] par .get(i)
            somme += notesPhysique.get(i);  //OU somme = somme + notesPhysique[i];

        }


        double moyenne = somme /notesPhysique.size();

        System.out.println("somme : " + somme);
        System.out.println("moyenne : " + moyenne);

    }
}
