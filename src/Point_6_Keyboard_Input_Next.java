import java.util.Scanner; //permet de lire les donnees a partir du clavier

public class Point_6_Keyboard_Input_Next {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in); //System Input - toujours une chaine de caracteres

    //    System.out.print("Votre nom : "); //avec println : retour automatique à la ligne
    //    String nom=keyboard.next(); //next(): suit les caracteres jusqu'a un espace entre les caracteres ou un retour a la ligne
    //    System.out.printf("Votre nom est : %s", nom);

        System.out.print("votre nom :");
        String prenom=keyboard.next();
        String nom=keyboard.next();
        String pays=keyboard.next();

        System.out.printf("Votre nom: %s\nVotre prenom: %s\nVotre pays: %s", nom, prenom, pays);

    //    System.out.print("Votre age : ");
    //    int age=keyboard.nextInt(); //saisi d'abord du texte, puis convertir en entier (int)
    //    System.out.printf("age: %d", age);

    }
}
