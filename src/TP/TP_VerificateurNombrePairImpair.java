package TP;

public class TP_VerificateurNombrePairImpair {
    public static boolean estPair(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
        //OU return n % 2 == 0
    }

    public static void main(String[] args) {
        System.out.println(estPair(4));
        System.out.println(estPair(7));
    }
}
