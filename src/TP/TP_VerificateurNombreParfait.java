package TP;

public class TP_VerificateurNombreParfait {
    //TD3 Vérificateur de nombre parfait
    //Créez une méthode `estNombreParfait(int n)` qui retourne `true` si n est un nombre parfait, `false` sinon.
    public static boolean estNombreParfait(int n) {
        //calculer la somme des diviseurs de ce nombre
        int nombresDiviseurs = 0;
        for (int i = 1; i < n / 2; i++) {
            if (n % i == 0) {
                nombresDiviseurs++;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print("6 " + estNombreParfait(6) + "\n");
        System.out.print("28 " + estNombreParfait(28) + "\n");
        System.out.print("12 " + estNombreParfait(3) + "\n");

    }
}
