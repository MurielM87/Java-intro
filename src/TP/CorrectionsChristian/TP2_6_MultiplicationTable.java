package TP.CorrectionsChristian;

public class TP2_6_MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Tables de multiplication");

        // Boucle pour chaque table de 2 à 10
        for (int i = 2; i <= 10; i++) {
            System.out.println("Table de " + i + " :");

            // Boucle pour chaque multiplication de 1 à 10
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + " * " + i + " = " + (j * i));
            }

            // Ligne vide entre chaque table
            System.out.println();
        }
    }
}
