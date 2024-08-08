import java.util.Scanner;

public class Point_13_BouclesFor {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
    /*    System.out.printf("le carré de %d est %f\n", 2, Math.pow(2,2));
        System.out.printf("le carré de %d est %.1f\n", 3, Math.pow(3,2));
        System.out.printf("le carré de %d est %.2f\n", 4, Math.pow(4,2));
        System.out.printf("le carré de %d est %.3f\n", 5, Math.pow(5,2));

        for(int n=2; n<=5; n++) { //on commence à 2, on va jusqu'à 5 - n=n+1 => n++(POST-incrémentation de la valeur)
            //n = 2 - le carré de 2 est 4
            //n = n + 1 => n = 2 + 1 = 3 - le carré de 3 est 9
            //n = n + 1 => n = 3 + 1 = 4 - le carré de 4 est 16
            //n = n + 1 => n = 4 + 1 = 5 - le carré de 5 est 25
            //n = n + 1 => n = 5 + 1 = 6 - boucle terminee
            System.out.printf("le carré de %d est %.1f\n", n, Math.pow(n,2));
        }*/

        //table de multiplication d'un nombre saisi a partir du clavier
        System.out.print("Entrez un nombre entier entre 1 et 11 : ");
        int nombre = keyboard.nextInt();

        if (nombre == 0 || nombre > 11) {
            System.out.println("nombre incorrect");
        }

        for (int n = 0; n <= 11; n++) {
            System.out.print(nombre + " x " + n + " = " + n * nombre + "\n");
            //    System.out.printf("%d x d% = %d\n", nombre, n, (nombre*n));
        }


    }

}


