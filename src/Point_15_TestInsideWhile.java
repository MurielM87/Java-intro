import java.util.Scanner;

public class Point_15_TestInsideWhile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //on ne connait pas le nombre de boucles
        /*    while(condition) {instructions}
         * do {instructions} while(condition) */ //meme quand pas les conditions, les instrction s'appliquent au moins une fois

        System.out.print("Veuillez créer un code pin : ");
        int codePin = keyboard.nextInt();

        int codePinATester;
        //tant que le code pin est différent de celui des parametres
        do {
            System.out.print("Veuillez entrer le code pin pour débloquer l'appareil : ");
            codePinATester = keyboard.nextInt();
            if (codePinATester != codePin) {
                System.out.println("code pin incorrect");
            } else {
                System.out.println("Welcome");
            }
        } while (codePinATester != codePin); //si condition True, on reste dans la boucle - false : on sort de la boucle

    }
}
