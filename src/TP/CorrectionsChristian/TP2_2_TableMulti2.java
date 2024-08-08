package TP.CorrectionsChristian;

import java.util.Scanner;

public class TP2_2_TableMulti2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Nombre : ");
        int nombre = keyboard.nextInt();

        System.out.print("Borne inférieure : ");
        int borneInf = keyboard.nextInt();

        System.out.print("Borne supérieure : ");
        int borneSup = keyboard.nextInt();

        if (borneInf > borneSup) {
            int temp = borneInf;
            borneInf = borneSup;
            borneSup = temp;
            System.out.println("Les bornes ont été permutées pour assurer borneInf <= borneSup");
        }

        System.out.println("Table de "+nombre);
        System.out.println("============\n");

        for (int i = borneInf; i <= borneSup; i++) {
            System.out.printf("%d x %d = %d\n", nombre, i, (nombre * i));
        }

        keyboard.close();
    }
}
