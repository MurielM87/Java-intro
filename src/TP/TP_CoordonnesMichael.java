package TP;

import java.util.Scanner;

public class TP_CoordonnesMichael {
    //DISPLAY
    public static void runGridMovement() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Grid Movement program is running.");
    }

    //FUNCTION
    public static int[] finalPosition(String[] directions) {
        int x = 0, y = 0; // Starting position
        // Process each direction in the array
        for (String direction : directions) {
            switch (direction) {
                case "haut"-> y++;
                case "bas"-> y--;
                case "gauche"-> x--;
                case "droite"-> x++;
                default-> System.out.println("Direction non reconnue : " + direction);
            }
        }
        // Return final position as an array of two integers
        return new int[]{x, y};
    }
}
