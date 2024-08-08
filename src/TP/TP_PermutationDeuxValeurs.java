package TP;

import java.util.Scanner;

public class TP_PermutationDeuxValeurs {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //algorithme pour permutter les valeurs de deux variables
        //x=1 et y=2 devient x=2 et y=1

        System.out.print("valeur de x : ");
        int x = keyboard.nextInt();
        System.out.print("valeur de y : ");
        int y = keyboard.nextInt();

        x = x + y;
        y = Math.abs(x-y);
        x = x - y;
        //ou utiliser une variable temporaire "tmp"

        System.out.print("la valeur de" + x + " et la valeur de y" + y);
    }
}
