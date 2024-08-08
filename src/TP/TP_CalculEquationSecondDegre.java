package TP;

import java.util.Scanner;

public class TP_CalculEquationSecondDegre {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        /*Écrivez un programme Java qui permet de résoudre une équation du 2nd degré de la forme ax2+bx+c = 0.
         L’utilisateur devra fournir a,b,c à partir du clavier, ensuite le programme lui donnera la solution
          */
        System.out.print("Entrez une valeur a : ");
        double a = keyboard.nextDouble();
        //possibilité de mettre le if pour vérifier a!=0
        System.out.print("Entrez une valeur b : ");
        double b = keyboard.nextDouble();
        System.out.print("Entrez une valeur c : ");
        double c = keyboard.nextDouble();

        //ax2 + bx + c = 0
        //a!=0 -> afficher message "ce n'est pas une équation du second degré" et arrêter
        if(a==0) {
            System.out.print("ce n'est pas une équation du second degré");
        } else { //calculer delta
            double delta = b * b - 4 * a * c; //b² - 4ac
            if(delta < 0) {
                System.out.println("pas de solution réelle");
            } else if(delta==0) { //1 solution
                double x0 = -b / (2 * a);
                System.out.println("resultat = " + x0);
            } else { //2 solutions
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("solutions = " + x1 + " et " +x2);
            }
        }
    }
    /*
    * ```java
public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double a, b, c;
        System.out.print("Entrez un nombre a (ne doit pas être 0): ");
        if (a == 0) {
            System.out.println("a=0; ceci n'est pas une équation du second degré.");
            return;
        }
        a = keyboard.nextDouble();

        System.out.print("Entrez un nombre b: ");
        b = keyboard.nextDouble();

        System.out.print("Entrez un nombre c: ");
        c = keyboard.nextDouble();

//      Calculer le signe de delta
        double delta = b * b - 4 * a * c;
        double racine1, racine2;

        switch ((delta > 0) ? "positif" : (delta == 0) ? "nul" : "negatif") {
            case "positif" -> {
                racine1 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("le 1er résultat est racine1= " + racine1);
                racine2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("le 1er résultat est racine2= " + racine2);

                System.out.println("L'équation a deux racines réelles : " + racine1 + " et " + racine2 + ".");
            }
            case "nul" -> {
                racine1 = -b / (2 * a);
                System.out.println("L'équation a une racine réelle racine1= " + racine1);
            }
            case "negatif" -> {
                System.out.println("Δ est négatif. L'équation n'a pas de racines réelles.");
            }
        }

    }
```*/
}
