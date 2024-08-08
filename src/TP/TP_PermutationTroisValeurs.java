package TP;

import java.util.Scanner;

public class TP_PermutationTroisValeurs {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        //déclarer 3 variables a, b, c; puis effectuer une permuttation de ces valeurs
        System.out.print("valeur de a : ");
        int a = keyboard.nextInt();
        System.out.print("valeur de b : ");
        int b = keyboard.nextInt();
        System.out.print("valeur de c : ");
        int c = keyboard.nextInt();
        System.out.printf("la valeur de a : " + a + ", la valeur de b : " + b + " et la valeur de c " + c);
        int tmp = a; //variable temporaire
        a = c;
        c = b;
        b = tmp;

        System.out.printf("\nla nouvelle valeur de a : " + a + ", de b : " + b + " et de c " + c);

    }

}
