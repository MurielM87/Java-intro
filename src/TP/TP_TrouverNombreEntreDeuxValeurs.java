package TP;

import java.util.Scanner;

public class TP_TrouverNombreEntreDeuxValeurs {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //un nombre entre 1 et 3
/*        int nombre;
        do {
            System.out.print("choississez un nombre entier : ");
            nombre = keyboard.nextInt();
        }
        while(nombre < 1 || nombre >3);*/

        //un nombre compris entre 10 et 20 -
        //en cas de réponse supérieur à 20 faire apparaître message "plus petit" et
        // inférieur à 10 "plus grand"
        int chiffreChoisi;
        do{
            System.out.println("choississez un nombre");
            chiffreChoisi = keyboard.nextInt();
            if(chiffreChoisi < 10) {
                System.out.println("plus grand");
            } else if(chiffreChoisi > 20) {
                System.out.println("plus petit");
            }
        } while (chiffreChoisi < 10 || chiffreChoisi > 20);

    }
}
