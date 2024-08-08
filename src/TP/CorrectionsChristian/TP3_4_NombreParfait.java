package TP.CorrectionsChristian;

public class TP3_4_NombreParfait {
    public static boolean estNombreParfait(int n) {
        int somme = 1;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) somme += i;
        }
        return somme == n;
    }

    public static void main(String[] args) {
        System.out.println("6 est un nombre parfait : " + estNombreParfait(6));
        System.out.println("28 est un nombre parfait : " + estNombreParfait(28));
        System.out.println("12 est un nombre parfait : " + estNombreParfait(12));
    }
}
