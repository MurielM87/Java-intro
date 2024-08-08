package TP.CorrectionsChristian;

import java.util.Scanner;

public class TP2_8_NombreParfait {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Veuillez entrer le nombre à tester : ");
        int nombreATester = keyboard.nextInt();

        int sommeDesDiviseurs = 0;
        for (int i = 1; i < nombreATester; i++) {
            if(nombreATester % i == 0){
                sommeDesDiviseurs += i;
            }
        }

        if(nombreATester == sommeDesDiviseurs){
            System.out.printf("%d est un nombre parfait.", nombreATester);
        }else {
            System.out.printf("%d n'est pas un nombre parfait.", nombreATester);
        }
    }
}
