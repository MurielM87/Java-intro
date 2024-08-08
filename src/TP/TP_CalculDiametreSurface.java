package TP;

import java.util.Scanner;

public class TP_CalculDiametreSurface {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        //saisir la valeur du diametre, et effectuer le calcul de la surface
        System.out.println("diametre : ");

        //Surface = Rayon x Rayon xPI;
        //Rayon = Diametre / 2
        double Diametre= keyboard.nextInt();
        double Rayon = Diametre / 2;

        double Surface = Rayon * Rayon * Math.PI; //Math.pow(Rayon, 2)*Math.PI
        System.out.printf("La surface : %.3f", Surface);


     }
}

