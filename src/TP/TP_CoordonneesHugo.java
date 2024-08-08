package TP;

import java.util.Arrays;

public class TP_CoordonneesHugo {
    public static void main(String[] args) {
        String[] directions = { "haut", "haut", "bas", "gauche", "gauche", "droite", "haut" };

        System.out.println("Position du personnage : " + Arrays.toString(deplacePersonnage(directions)));
    }

    public static int[] deplacePersonnage(String[] directions) {
        int x = 0;
        int y = 0;
        int[] position = { x, y };

        for (String direction : directions) {
            if (direction == "haut") {
                position[1] += 1;
            }
            else if (direction == "bas") {
                position[1] -= 1;
            }
            else if (direction == "droite") {
                position[0] += 1;
            }
            else if (direction == "gauche") {
                position[0] -= 1;
            }
        }

        return position;
    }
}
