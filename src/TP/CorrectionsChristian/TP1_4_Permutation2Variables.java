package TP.CorrectionsChristian;

import java.util.Scanner;

public class TP1_4_Permutation2Variables {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entrez x : ");
        int x = keyboard.nextInt();
        System.out.print("Entrez y : ");
        int y = keyboard.nextInt();
        System.out.printf("Avant permutation: x = %d, y = %d\n", x, y);
        int temp = x;
        x = y;
        y = temp;
        System.out.printf("Après permutation: x = %d, y = %d\n", x, y);
        keyboard.close();
    }
}
