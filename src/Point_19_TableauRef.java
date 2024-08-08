import java.util.Arrays;
import java.util.Scanner;

public class Point_19_TableauRef {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
    /*    int a = 10;
        int b = a;
        a = 25;
        System.out.println("a : " +a);
        System.out.println("b : " +b); */

        int[] notes={12,13,14};
        int[] papy=notes;
        int[] papy2={500,13,14};
        System.out.println("notes : " +Arrays.toString(notes));
        System.out.println("papy : " + Arrays.toString(papy));

        papy[0] = 500;
        System.out.println("notes2 : " +Arrays.toString(notes)); //même changement
        System.out.println("papy2 : " + Arrays.toString(papy)); //même changement
        System.out.println("papy 2 : " + Arrays.toString(papy2));

        System.out.println("est cec que notes==papy : " +(notes==papy)); //true
        System.out.println("papy + papy2 " +(papy==papy2)); //false car papy & papy2 pointent vers deux tableaux différents (même si les valeurs sont identifiques)

        String nom = "chris";
        String prenom = "chris";

        System.out.println("votre nom : ");
        String postNom = keyboard.nextLine();
        //postNom = postNom.intern(); //les sout en dessous sont true car donne reference d'un String deja existant donc compare les valeurs
                                    //inclure la variable postNom dans le pool des littéraux

        //les String sont imuables
        System.out.println("nom == prenom " + (nom==prenom)); //true car les deux pointent vers la meme chaine de caracteres
        System.out.println("postNnom == prenom " + (postNom==prenom)); //false car variables crées à partir du clavier donc nouvelle chaine de caracteres
        System.out.println("nom == postNom " + (nom==postNom));//false   --- pour remplacer un caractere dans String, il faut creer une nouvelle variable qui ecrase l'ancienne
        System.out.println("nom == prenom " + postNom.equals(nom)); // true
        System.out.println("nom == prenom " + postNom.equals(prenom)); //true     --- voir StringBuilder pour modifier directement sur la chaine de caracteres

    }
}
