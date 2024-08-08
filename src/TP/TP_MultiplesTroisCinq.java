package TP;

import java.util.Scanner;
//TP 2 : les multiples de 3 et 5
public class TP_MultiplesTroisCinq {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("choississez un nombre à partir de 1 : ");
        int n = keyboard.nextInt();

        //afficher en console les nombres de 1 à n
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) { //pour les multiples de trois, il affiche "fizz" à la place du nombre
                System.out.print("fizz");
            } else if (i % 5 == 0) {  //pour les multiples de cinq, imprimez "buzz".
                System.out.println("buzz");
            } else if (i % 3 == 0) { //Pour les nombres qui sont des multiples multiples à la fois de trois et de cinq, imprimez "fizzbuzz".
                System.out.println("fizzbuzz");
            }

        }
    }
}
