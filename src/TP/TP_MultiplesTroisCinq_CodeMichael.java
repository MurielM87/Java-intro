package TP;

import java.util.Scanner;

public class TP_MultiplesTroisCinq_CodeMichael {
    public class FizzBuzz {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Entrez la longueur de la liste: ");
            int longueurListe = keyboard.nextInt();

            for (int i = 1; i <= longueurListe; i++) {
                String remplaceNombre = "";
                if (i % 3 == 0) remplaceNombre += "fizz";
                if (i % 5 == 0) remplaceNombre += "buzz";
                if (i % 7 == 0) remplaceNombre += "fuzz";
                switch (remplaceNombre) {
                    case "fizzbuzzfuzz"-> System.out.println("fizzbuzzfuzz");
                    case "fizzbuzz"-> System.out.println("fizzbuzz");
                    case "fizzfuzz"-> System.out.println("fizzfuzz");
                    case "buzzfuzz"-> System.out.println("buzzfuzz");
                    case "fizz"-> System.out.println("fizz");
                    case "buzz"-> System.out.println("buzz");
                    case "fuzz"-> System.out.println("fuzz");
                    default-> System.out.println(i);
                }
            }
            keyboard.close();
        }
    }
}
